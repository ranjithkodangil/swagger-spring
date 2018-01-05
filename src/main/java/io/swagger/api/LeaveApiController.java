package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Quota;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T07:23:29.948Z")

@Controller
public class LeaveApiController implements LeaveApi {


    @CrossOrigin(origins = "*")
    public ResponseEntity<Quota> leaveQuotaGet() {
        // do some magic!
        Quota q1 = new Quota();
        q1.setAvailableQuota(10);
        q1.setDescription("Thanks for submitting your request. We will try to accomdate your leave request and inform you at the earliest");
        return new ResponseEntity<Quota>(q1,HttpStatus.OK);
    }

}
