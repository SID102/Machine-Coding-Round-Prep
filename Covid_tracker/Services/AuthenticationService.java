package Covid_tracker.Services;

import Covid_tracker.Repository.UserRespository;
import Covid_tracker.Models.Role;
import Covid_tracker.Exceptions.UserAlreadyExistException;
import Covid_tracker.Exceptions.UserNotFoundException;
import Covid_tracker.Exceptions.ValidationException;
import Covid_tracker.Models.User;

public class AuthenticationService{
    
    UserRespository userRepository;

    public AuthenticationService(UserRespository userRespository){
        this.userRepository=userRespository;
    }

    public void registerUser(String passWord,Long phoneNumber,Role role,int pincode){
        if(this.userRepository.isExistByPhone(phoneNumber)){
            throw new UserAlreadyExistException("User with phone number " + phoneNumber + " already exists.");
        }
        validPhoneNumber(phoneNumber);
        validPincode(pincode);
        User user=new User(phoneNumber,passWord,role,pincode);
        this.userRepository.save(user);
    }

    public void validPhoneNumber(Long phoneNumber){
        String phoneNumberString=String.valueOf(phoneNumber);
        if(phoneNumberString.length()!=10){
            throw new ValidationException("Invalid phone number : " + phoneNumber);
        }
    }
    public void validPincode(int pincode){
        if(pincode<100000||pincode>999999){
            throw new ValidationException("Invalid pincode: "+ pincode);
        }
    }

    public User login(Long phoneNumber, String passWord){

        User user=this.userRepository.findByPhone(phoneNumber).orElseThrow(()-> new UserNotFoundException("user not found with id: "+ phoneNumber));

        if(!user.getPassWord().equals(passWord)){
            throw new ValidationException("Invalid Password : "+passWord);
        }

        return user;

    }

}
