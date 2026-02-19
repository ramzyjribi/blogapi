package com.devtiro.blog.mappers;

import com.devtiro.blog.domain.dtos.TagDto;
import com.devtiro.blog.domain.entities.Tag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T15:40:25+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto toTagResponse(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDto.TagDtoBuilder tagDto = TagDto.builder();

        tagDto.postCount( calculatePostCount( tag.getPosts() ) );
        tagDto.id( tag.getId() );
        tagDto.name( tag.getName() );

        return tagDto.build();
    }
}
