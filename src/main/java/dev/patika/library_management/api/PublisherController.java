package dev.patika.library_management.api;


import dev.patika.library_management.business.PublisherService;
import dev.patika.library_management.dto.response.PublisherResponse;
import dev.patika.library_management.entities.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/publisher")

public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<PublisherResponse> findAll() {
        return publisherService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PublisherResponse getById(@PathVariable("id") Long id) {
        return publisherService.getById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Publisher save(@RequestBody Publisher publisher) {
        return publisherService.create(publisher);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Publisher update(@PathVariable Long id, @RequestBody Publisher newPublisher) {
        return publisherService.update(id, newPublisher);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        publisherService.deleteById(id);
    }


}
