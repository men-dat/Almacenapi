package net.universal.control_calidad_api.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

}
