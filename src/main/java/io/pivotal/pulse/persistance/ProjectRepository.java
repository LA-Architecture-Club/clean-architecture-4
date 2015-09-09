package io.pivotal.pulse.persistance;

import io.pivotal.pulse.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
