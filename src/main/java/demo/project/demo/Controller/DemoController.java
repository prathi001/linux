package demo.project.demo.Controller;

import demo.project.demo.Model.DemoModel;
import demo.project.demo.Service.DemoService;
import demo.project.demo.Service.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/class")
public class DemoController {


    @Autowired
    public DemoService demoService;

    @PostMapping("/student")
    public Response<Object> createId(@RequestBody DemoModel demoModel){
        return demoService.createId(demoModel);
    }


    @GetMapping("/student/{id}")

    public Response<Object> getId(@PathVariable int id){
       return demoService.getId(id);

    }
    @DeleteMapping("/delete/{id}")


    public Response<Object> deleteId(@PathVariable int id){

        return demoService.deleteId(id);

    }
    @PutMapping("/update/{id}")

    public Object updateId(@PathVariable int id ,
                           @RequestBody DemoModel demoModel){

        return demoService.updateId(id, demoModel);

    }
    @GetMapping("/ListId")
    public Response<Object> getAllId() {
         return demoService.getAllId();

    }

    }



