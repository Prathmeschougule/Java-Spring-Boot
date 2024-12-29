package hospital.manage;

import java.util.List;

public interface HospitalServices {
    
    List<HospitalModel>getAllPaitent();
    HospitalModel getPaitentid(int id );
    String savePaitent(HospitalModel hospitalModel);
    String paitentdelet(int id );
  
}
