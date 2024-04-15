package dev.patika.library_management.core.mapper;


import dev.patika.library_management.dto.request.AuthorRequest;
import dev.patika.library_management.dto.response.AuthorResponse;
import dev.patika.library_management.entities.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


import java.util.List;

@Mapper
public interface AuthorMapper {
    Author asEntity(AuthorRequest authorRequest);

    AuthorResponse asOutput(Author author);

    List<AuthorResponse> asOutput(List<Author> author);

    void update(@MappingTarget Author entity, AuthorRequest request);


}
