package med.voll.api.cliente;

import io.micrometer.observation.ObservationFilter;
import med.voll.api.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Page<Cliente> findAllByAtivoTrue(Pageable paginacao);

}
