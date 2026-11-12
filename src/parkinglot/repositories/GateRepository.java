package src.parkinglot.repositories;

import src.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository implements IGateRepository{
    private Map<Long,Gate> gates = new TreeMap<>();

    @Override
    public Optional<Gate> findGateById(Long gateId) {
     if(gates.containsKey(gateId)){
         return Optional.of(gates.get(gateId));
     }
     return Optional.empty();
    }
}
