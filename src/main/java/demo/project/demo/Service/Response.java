package demo.project.demo.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Type;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
    public class Response<T> {


        @ApiModelProperty(example = "200")
        public Integer code;
        @ApiModelProperty(example = "Successfull")
        public String message;
        @ApiModelProperty(hidden = true)
        public T data;
}
