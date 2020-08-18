package com.example.app.controllers;
import com.example.app.models.Retailers;
import com.example.app.service.RetailerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class HomeController {
    RetailerService retailersService;
    @RequestMapping(method = RequestMethod.GET, value ="/")
    public String home(){
        return "Hello form server";
    }
    @GetMapping(value = "/retailer")
    public List<Retailers> getAllRetailers(){
        return retailersService.getAllRetailers();
    }
    @GetMapping(value = "/retailer/{id}")
    public Retailers getRetailsById(@PathVariable int id){
        return retailersService.getRetaileresById(id);
    }
   @DeleteMapping("/retailer/{id}")
    public void deleteRetailer(@PathVariable int id){
        retailersService.removeRetailersById(id);
    }
    @PostMapping("/retailer/register")
    public Retailers addRetailers(@RequestBody Retailers retailers ) {
        retailersService.addRetailers(retailers);
        return retailers;
    }
        @PutMapping("/retailer/{id}")
        public void updateRetailer(@RequestBody Retailers retailers, @PathVariable int id){
            retailersService.updateRetailer(retailers, id);

        }
}