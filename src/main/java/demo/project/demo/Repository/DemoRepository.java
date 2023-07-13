package demo.project.demo.Repository;

import demo.project.demo.Model.DemoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DemoRepository extends JpaRepository<DemoModel, Integer> {



}
