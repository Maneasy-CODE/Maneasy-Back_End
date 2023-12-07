package api.maneasy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_profissionais_squads")
public class ProfissionalSquadsModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tb_profissionais_squads", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_profissional", referencedColumnName = "id_profissional")
    private ProfissionalModel profissional;

    @ManyToOne
    @JoinColumn(name = "id_squad", referencedColumnName = "id_squad")
    private SquadModel id_squads;
}
