package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.envers.Audited;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
//@Audited
public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "articulo_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Articulo articulo;

}
