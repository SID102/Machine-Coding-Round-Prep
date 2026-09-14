package Covid_tracker.Repository;

import java.util.*;

import Covid_tracker.Models.User;

public class InMemoryUserRepository implements UserRespository{
    
    Map<Long , User> userMap =new HashMap<>();

    @Override
    public void save(User user){
        userMap.put(user.getPhoneNumer(),user);
    }

    @Override
    public Optional<User> findByPhone(long phoneNumber){
        return Optional.ofNullable(userMap.get(phoneNumber));
    }

    @Override
    public boolean isExistByPhone(long phoneNumber){
        return userMap.containsKey(phoneNumber);
    }

    @Override
    public List<User> findAll(){
        List<User> all=new ArrayList<>();
        for(Map.Entry<Long,User> entry:userMap.entrySet()){
            all.add(entry.getValue());
        }
        return all;
    }

}
