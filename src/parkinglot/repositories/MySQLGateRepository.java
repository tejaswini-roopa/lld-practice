package src.parkinglot.repositories;

import src.parkinglot.models.Gate;

import java.util.Optional;

public class MySQLGateRepository implements IGateRepository{

    @Override
    public Optional<Gate> findGateById(Long gateId) {
        return Optional.empty();
    }
}
