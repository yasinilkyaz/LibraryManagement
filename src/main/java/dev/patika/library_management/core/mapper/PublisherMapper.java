package dev.patika.library_management.core.mapper;


import dev.patika.library_management.dto.response.PublisherResponse;
import dev.patika.library_management.entities.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
