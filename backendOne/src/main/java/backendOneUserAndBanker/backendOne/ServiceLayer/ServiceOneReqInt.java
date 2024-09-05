package backendOneUserAndBanker.backendOne.ServiceLayer;



import backendOneUserAndBanker.backendOne.ModelLayer.UserTempData;

import java.util.List;

public interface ServiceOneReqInt {
    void addTempData(UserTempData userTempData); // POST
    List<UserTempData> sendDataToBanker(); // GET
    void removeDataFromTemp(Integer nationalId);
}
