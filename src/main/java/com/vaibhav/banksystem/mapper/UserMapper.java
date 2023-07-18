package com.vaibhav.banksystem.mapper;

import com.vaibhav.banksystem.dto.UserDto;
import com.vaibhav.banksystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
  User userDtoToUser(UserDto userDto);

  UserDto userToUserDto(User user);
}
