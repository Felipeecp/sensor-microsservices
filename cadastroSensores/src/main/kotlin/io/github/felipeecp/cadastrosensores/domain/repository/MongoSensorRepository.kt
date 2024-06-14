package io.github.felipeecp.cadastrosensores.domain.repository

import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MongoSensorRepository: MongoRepository<Sensor, String>, SensorRepository