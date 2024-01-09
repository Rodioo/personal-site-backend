package com.antonio_falcescu.personal_site_backend.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository
                .findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException(String.format("Project with id %d doesn't exist.", id))
                );
    }
}
