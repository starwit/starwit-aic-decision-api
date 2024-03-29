package de.starwit;

import java.net.URI;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import de.starwit.aicockpit.DecisionModel;
import de.starwit.aicockpit.Info;
import de.starwit.aicockpit.ModelType;

@Controller
@RequestMapping("${openapi.aICockpitDecisions.base-path:/v0}")
public class InfoApiController implements InfoApi {

    private final NativeWebRequest request;

    static final Logger LOG = LoggerFactory.getLogger(InfoApiController.class); 

    @Override
    public ResponseEntity<List<Info>> getInfo() {
        ArrayList<Info> result = new ArrayList<>();
        Info i = new Info();
        i.setApiVersion("0.0.1");
        i.setGenerationDate(OffsetDateTime.now(ZoneOffset.of("+01:00")));
        i.setSystemDescription("A traffic management system");
        DecisionModel m = new DecisionModel();
        m.setLastDeployment(OffsetDateTime.now(ZoneOffset.of("+01:00")));
        m.setModelType(ModelType.COMPUTERVISION);
        m.setName("Yolov8");
        m.setPublicTrainingData(true);
        m.setLinkToPublicTrainingData(URI.create("https://starwit-technologies.de/"));        
        m.setVersion("2.0.0");
        i.setUsedModel(m);
        result.add(i);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Autowired
    public InfoApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
