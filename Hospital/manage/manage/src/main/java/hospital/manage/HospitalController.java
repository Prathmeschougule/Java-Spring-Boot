package hospital.manage;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("paitent")
public class HospitalController {

    // dependacy Injection 
    @Autowired
    HospitalServices hospitalServices;
    
    private HospitalController(HospitalServices hospitalServices){
       this.hospitalServices=hospitalServices;
    }
    
    @GetMapping
    public List<HospitalModel> getAllPaitent() {
        return hospitalServices.getAllPaitent();
    }
    @GetMapping("/{id}")
    public HospitalModel getByIdPaitent(@PathVariable int id ) {
      
        return hospitalServices.getPaitentid(id);
    }
   
    @PostMapping
    public String postMethodName(@RequestBody HospitalModel hospitalModel) {
        //TODO: process POST request
        
        return hospitalServices.savePaitent(hospitalModel);
    }

    @DeleteMapping("/{id}")
    public String deletePaitent(@PathVariable int id){
        return hospitalServices.paitentdelet(id);
    }
    
    @PutMapping("/{id}")
    public HospitalModel putMethodName(@PathVariable int id, @RequestBody HospitalModel hospitalModel) {
        return hospitalServices.updatePaitent(id, hospitalModel); // Call using the instance
    }
    
}
