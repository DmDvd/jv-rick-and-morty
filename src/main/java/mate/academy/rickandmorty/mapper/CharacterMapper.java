package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.CharactersDto;
import mate.academy.rickandmorty.dto.RickAndMortyApiCharacterDto;
import mate.academy.rickandmorty.model.Character;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface CharacterMapper {
    CharactersDto toDto(Character character);

    Character toModel(CharactersDto responseDto);

    Character fromApiDto(RickAndMortyApiCharacterDto apiDto);
}
