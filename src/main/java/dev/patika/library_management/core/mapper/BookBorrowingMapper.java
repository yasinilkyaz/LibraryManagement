package dev.patika.library_management.core.mapper;


import dev.patika.library_management.dto.request.BookBorrowingRequest;
import dev.patika.library_management.dto.request.BookBorrowingUpdateRequest;
import dev.patika.library_management.entities.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper

public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
