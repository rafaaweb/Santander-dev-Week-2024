package me.dio.sdw24.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.sdw24.application.ListChampionsUseCase;
import me.dio.sdw24.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do dominio de campeões do LOL.") //Swagger
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase){

    @GetMapping
    public List<Champion> findAllChampions(){
        return useCase.findAll();
    }

}
