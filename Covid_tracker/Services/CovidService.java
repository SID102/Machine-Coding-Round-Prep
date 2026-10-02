package Covid_tracker.Services;

import Covid_tracker.Repository.CovidRepository;
import Covid_tracker.Repository.UserRespository;
import Covid_tracker.Models.CovidRecord;
import Covid_tracker.Models.Role;
import Covid_tracker.Models.User;
import Covid_tracker.Exceptions.UserNotFoundException;
import Covid_tracker.Exceptions.ValidationException;

public class CovidService {
    
    private final UserRespository userRespository;

    private final CovidRepository covidRepository;

    public CovidService(UserRespository userRespository,CovidRepository covidRepository){
        this.covidRepository=covidRepository;
        this.userRespository=userRespository;
    }

    public void addCovidResult(long userId,long adminId,boolean covidPositive){
        validateAdmin(adminId);
        User user=this.userRespository.findByPhone(userId).get();
        if(!user.getRole().equals(Role.USER)){
            throw new ValidationException("Only USER role can update covid result");
        }
        if(this.covidRepository.findByUserId(userId)!=null){
            throw new ValidationException("User already exists");
        }
        this.covidRepository.save(new CovidRecord(userId, covidPositive));
    }
    public void updateCovidResult(long userId,long adminId,boolean covidPositive){
        validateAdmin(adminId);
        CovidRecord covidRecord=this.covidRepository.findByUserId(userId).orElseThrow(()-> new ValidationException("Covid result not found"));
        covidRecord.setCovidPositive(covidPositive);
        this.covidRepository.save(covideRecord);
    }

    public void validateAdmin(long adminId){
        User user=this.userRespository.findByPhone(adminId).get();
        if(!user.getRole().equals(Role.ADMIN)){
            throw new ValidationException("Invalid Admin id: "+adminId);
        }
    }

}
