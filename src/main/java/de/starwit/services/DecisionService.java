package de.starwit.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import de.starwit.aicockpit.AutonomyLevel;
import de.starwit.aicockpit.Decision;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@ApplicationScope
@Service
public class DecisionService {

    static final Logger LOG = LoggerFactory.getLogger(DecisionService.class);

    private List<Decision> decisions;

    @PostConstruct
    private void setup() {
        LOG.debug("initialize decision service");
        decisions = new ArrayList<>();
        Decision d = new Decision();
        d.setAutonomyLevel(AutonomyLevel.AUTONOMOUS);
        d.setId(1);
        d.setName("ParkingGarageDecision");
        d.setUuid(UUID.randomUUID());
        decisions.add(d);

        Decision d2 = new Decision();
        d2.setAutonomyLevel(AutonomyLevel.AUTONOMOUS);
        d2.setId(2);
        d2.setName("TrafficLightDecision");
        d2.setUuid(UUID.randomUUID());
        d2.setFollowingDecisions(new ArrayList<>());
        d2.getFollowingDecisions().add(d);
        decisions.add(d2);
    }

    public void addDecision(@Valid Decision decision) {
        decisions.add(decision);
    }

    public List<Decision> getAllDecisions() {
        return decisions;
    }

    public Decision findById(Integer id) {
        for (Decision decision : decisions) {
            if(decision.getId() == id) {
                return decision;
            }
        }
        return null;
    }

    public void updateOrSave(@Valid Decision decision) {
        for (Decision d : decisions) {
            if(d.getId() == decision.getId()) {
                d = decision;
                return;
            }
        }
        decisions.add(decision);
    }
    
}
