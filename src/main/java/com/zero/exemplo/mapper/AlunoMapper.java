package com.zero.exemplo.mapper;

import com.zero.exemplo.modelo.Aluno;
import com.zero.exemplo.modelo.entity.AlunoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AlunoMapper {
    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);
    AlunoEntity alunoToEntity(Aluno aluno);
    Aluno entityToAluno(AlunoEntity alunoEntity);
    List<Aluno> entityListToListAluno(List<AlunoEntity> alunoEntityList);
}
