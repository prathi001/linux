package demo.project.demo.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class DemoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int  id;

    @Column(name="name")
    public String name;



    @Column(name="city")
    public String city;


    public Object build() {
        return null;
    }
}
