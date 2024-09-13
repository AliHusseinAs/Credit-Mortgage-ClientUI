package backend.two.investor.ServiceLayer;


import backend.two.investor.Model.InvestorRegDataTemp;

import java.util.List;

public interface ServiceTempData {
    void getAllData(InvestorRegDataTemp investorRegDataTemp);
    List<InvestorRegDataTemp> sendTempData();
    void removeDataFromTemp(Integer nationalId);
}
