package Covid_tracker.Repository;

import Covid_tracker.Models.CovidRecord;

public interface CovidRepository{

    public void save(CovidRecord covidRecord);
    public CovidRecord findByUserId(long userId);
    public void deleteByUserId(long userId);

}
