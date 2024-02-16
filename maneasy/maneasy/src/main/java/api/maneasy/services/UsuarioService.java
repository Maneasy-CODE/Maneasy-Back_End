package api.maneasy.services;

import api.maneasy.dtos.UsuarioDto;
import api.maneasy.models.UsuarioModel;
import api.maneasy.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder encoder;

    public UsuarioModel createUser(UsuarioDto usuarioDto) {

        if (usuarioRepository.findByEmail(usuarioDto.email()) != null) {
            throw new RuntimeException("Email já cadastrado no sistema");
        }
        if (usuarioRepository.findByChapa(usuarioDto.chapa()) !=null) {
            throw new RuntimeException("Chapa já cadastrado no sistema");
        }

        UsuarioModel usuarioModel = new UsuarioModel(usuarioDto.nome_usuario(), usuarioDto.chapa(), usuarioDto.email(),
                encoder.encode(usuarioDto.senha()), usuarioDto.tipos_usuario());

        //     BeanUtils.copyProperties(usuarioDto, usuarioModel);

        usuarioRepository.save(usuarioModel);

        return usuarioModel;
    }
}
