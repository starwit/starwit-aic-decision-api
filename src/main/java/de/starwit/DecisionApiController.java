package de.starwit;

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

import de.starwit.aicockpit.Decision;
import de.starwit.services.DecisionService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("${openapi.aICockpitDecisions.base-path:/v0}")
public class DecisionApiController implements DecisionApi {

    static final Logger LOG = LoggerFactory.getLogger(DecisionApiController.class);

    private final NativeWebRequest request;

    @Autowired
    DecisionService decisionService;

    @Override
    public ResponseEntity<Void> createDecision(@Valid Decision decision) {
        LOG.info("not implemented yet - sample data");
        decisionService.addDecision(decision);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Decision>> getAllDecisions() {
        List<Decision> decisions = decisionService.getAllDecisions(); 
        return new ResponseEntity<>(decisions, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Decision>> getDecisionsById(Integer id) {
        Decision d = decisionService.findById(id);
        ArrayList<Decision> result = new ArrayList<>();
        result.add(d);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updateDecision(Integer id, @Valid Decision decision) {
        decisionService.updateOrSave(decision);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @Autowired
    public DecisionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
