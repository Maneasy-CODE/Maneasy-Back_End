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
@Table(name = "tb_profissionais_hardskills")
public class ProfissionaisHardSkillModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_profissionais_hardskills", nullable = false)
    private UUID idProfssionalHardSkill;

    @Id
    @ManyToMany
    @JoinColumn(name = "id_profissional", referencedColumnName = "id_profissional")
    private ProfissionalModel id_profissional;
    @Id
    @ManyToMany
    @JoinColumn(name = "id_hard_skill", referencedColumnName = "id_hard_skill")
    private HardSkillModel id_hard_skill;
}