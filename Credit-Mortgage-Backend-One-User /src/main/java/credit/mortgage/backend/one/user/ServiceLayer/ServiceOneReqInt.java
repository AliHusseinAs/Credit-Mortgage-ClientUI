package credit.mortgage.backend.one.user.ServiceLayer;

import credit.mortgage.backend.one.user.ModelLayer.UserTempData;

import java.util.List;

public interface ServiceOneReqInt {
    void addTempData(UserTempData userTempData); // POST
    List<UserTempData> sendDataToBanker(); // GET
    void removeDataFromTemp(Integer nationalId);
}
