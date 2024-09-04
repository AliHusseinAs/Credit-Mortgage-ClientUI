package backend.two.investor.ServiceLayer;


import backend.two.investor.Model.InvestorRegDataTemp;

import java.util.List;

public interface serviceTempData {
    void getAllData();
    List<InvestorRegDataTemp> sendTempData();
    void removeDataFromTemp(Integer nationalId);
}
