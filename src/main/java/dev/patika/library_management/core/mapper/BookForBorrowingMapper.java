package dev.patika.library_management.core.mapper;


import dev.patika.library_management.dto.request.BookForBorrowingRequest;
import dev.patika.library_management.entities.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
