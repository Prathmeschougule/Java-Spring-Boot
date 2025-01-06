package hospital.manage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HospitalServiceImple  implements HospitalServices {
    @Autowired
    HospitalRepository hospitalRepository;

    private HospitalServiceImple(HospitalRepository hospitalRepository){
        this.hospitalRepository=hospitalRepository;
    }

    @Override
    public List<HospitalModel> getAllPaitent() {
        // type Conversion dto to model
        List<HospitalModel>hospitalModels=new ArrayList<>();
        List<HospitalDto>hospitalDb=hospitalRepository.findAll();

        for (HospitalDto hospitalDto : hospitalDb) {
            HospitalModel hospitalModel=new HospitalModel();
             BeanUtils.copyProperties( hospitalDto,hospitalModel);

             hospitalModels.add(hospitalModel);
        }
        return hospitalModels;
        
    }

   

    @Override
    public String savePaitent(HospitalModel hospitalModel) {
        
       HospitalDto hospitalDto=new HospitalDto();
       
       BeanUtils.copyProperties(hospitalModel, hospitalDto);
       System.out.println("This IS My data "+hospitalDto);
       hospitalRepository.save(hospitalDto);
       return "save Succefully";

    }

    @Override
    public HospitalModel getPaitentid(int id) {
    //    find The Id store In dto 
        HospitalDto hospitalDto =hospitalRepository.findById(id).get();
       
        // Create Model Object for Get value From the dto 
        HospitalModel hospitalModel=new HospitalModel();
        //  Here Copy The ALl Values From The Dto and Stor in model
        BeanUtils.copyProperties(hospitalDto, hospitalModel);
        
        // retrun The model ;
        return hospitalModel;
    }

    @Override
    public String paitentdelet(int id) {
      HospitalDto hospitalDto=hospitalRepository.findById(id).get();
      hospitalRepository.delete(hospitalDto);

       return "deletepaitent";
      
       
       
    }

    @Override
    public HospitalModel updatePaitent(int id, HospitalModel hospitalModel) {
      
        HospitalDto hospitalDto=hospitalRepository.findById(id).get();

        hospitalDto.setName(hospitalModel.getName());
        hospitalDto.setAddress(hospitalModel.getAddress());
        hospitalDto.setEmail(hospitalModel.getEmail());
        hospitalDto.setPhone(hospitalModel.getPhone());

        hospitalRepository.save(hospitalDto);

        return hospitalModel;
    }

  
    
    

  

   
    
}
