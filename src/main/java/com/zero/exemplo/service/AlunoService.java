package com.zero.exemplo.service;

import com.zero.exemplo.mapper.AlunoMapper;
import com.zero.exemplo.modelo.Aluno;
import com.zero.exemplo.modelo.entity.AlunoEntity;
import com.zero.exemplo.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    final
    AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos(){
        return AlunoMapper.INSTANCE.entityListToListAluno(alunoRepository.findAll());
    }
    public Aluno buscarId(Integer id){
        return AlunoMapper.INSTANCE.entityToAluno(alunoRepository.findById(id).get());
    }
    public Aluno cadastrar(Aluno aluno){
        aluno.setId(null);
        AlunoEntity entity = AlunoMapper.INSTANCE.alunoToEntity(aluno);
        return AlunoMapper.INSTANCE.entityToAluno(alunoRepository.save(entity));
    }
    public Aluno editar(Aluno aluno){
        AlunoEntity entity = AlunoMapper.INSTANCE.alunoToEntity(aluno);
        return AlunoMapper.INSTANCE.entityToAluno(alunoRepository.save(entity));
    }
}
