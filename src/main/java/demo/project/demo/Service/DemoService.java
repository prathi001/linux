package demo.project.demo.Service;
import demo.project.demo.Model.DemoModel;
import demo.project.demo.Repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    public DemoRepository demoRepository;

    public Response<Object> createId(DemoModel demoModel){
        return Response.builder()
                .code(200)
                .message(" ID created successfully")
                .data(demoRepository.save(demoModel))
                .build() ;


    }

    public Response<Object> getId(int id)
    {
        return Response.builder()
                .code(200)
                .message("Id No:" +id + "Details")
                .data(demoRepository.findById(id))
                .build();
    }
    public Response<Object> deleteId(int id) {
        return Response.builder()
                .code(200)
                .message("ID deleted successfully")
                .build() ;

    }
    public Object updateId(int id, DemoModel demoModel) {
        Optional<DemoModel> demoModel1 = demoRepository.findById(id);
        if(demoModel1.isPresent()) {
            DemoModel demo = demoModel1.get();
            demo.setName(demoModel.getName() == null ? demo.getName() : demoModel.getName());
            demo.setCity(demoModel.getCity() == null ? demo.getCity() : demoModel.getCity());
            return Response.builder()
                    .code(200)
                    .message("ID"+ " " + id + " " +"Updated successfully")
                    .data(Optional.of(demoRepository.save(demo)))
                    .build();
        } else{
            return Response.builder()
                    .code(200)
                    .message("ID not found")
                    .data(Collections.emptyList())
                    .build();
        }




    }
    public Response<Object> getAllId() {

        return  Response.builder()
                .code(200)
                .message("ID List")
                .data(demoRepository.findAll())
                .build();
    }

    }


