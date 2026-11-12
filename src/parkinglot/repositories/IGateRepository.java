package src.parkinglot.repositories;

import src.parkinglot.models.Gate;

import java.util.Optional;

public interface IGateRepository {
    Optional<Gate> findGateById(Long gateId);
}
