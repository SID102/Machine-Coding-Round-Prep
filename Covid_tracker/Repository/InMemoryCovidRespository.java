package Covid_tracker.Repository;

import java.util.*;
import Covid_tracker.Models.CovidRecord;

public class InMemoryCovidRespository implements CovidRepository {
    
    Map<Long,CovidRecord> covidMap=new HashMap<>();

    @Override
    public void save(CovidRecord covidRecord){
        covidMap.put(covidRecord.getUserId(),covidRecord);
    }

    @Override
    public CovidRecord findByUserId(long userId){
        if(!covidMap.containsKey(userId)){
            return null;
        }
        return covidMap.get(userId);
    }

    @Override
    public void deleteByUserId(long userId){
        covidMap.remove(userId);
    }

}
