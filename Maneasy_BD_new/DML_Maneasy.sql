USE bd_maneasy;

INSERT INTO tb_servicos (id_servicos, nome_servicos, data_criacao, data_inicio, data_termino, descricao_servicos, anexo, tipo_servicos, consultoria, status_servicos, orcamento, tempo_servico) VALUES
  (UUID_TO_BIN('bc42c2f1-c08e-11ee-847c-601895604814'), 'Serviço A', '2023-10-01', '2023-10-05', '2023-10-15', 'Descrição do Serviço A', '/anexos/servicoA.pdf', 1, 'Consultoria A', '0', '5000', '720000'),
  (UUID_TO_BIN('bc42c894-c08e-11ee-847c-601895604814'), 'Serviço B', '2023-09-15', '2023-09-20', '2023-09-30', 'Descrição do Serviço B', '/anexos/servicoB.docx', 0, 'Consultoria B', '1', '11000', '602000');
 /* (UUID_TO_BIN(UUID()), 'Serviço C', '2023-08-10', '2023-08-15', '2023-08-25', 'Descrição do Serviço C', '/anexos/servicoC.jpg', 1, 'Consultoria C', '2'),
  (UUID_TO_BIN(UUID()), 'Serviço D', '2023-07-20', '2023-07-25', '2023-08-05', 'Descrição do Serviço D', '/anexos/servicoD.png', 0, 'Consultoria D', '0'),
  (UUID_TO_BIN(UUID()), 'Serviço E', '2023-06-05', '2023-06-10', '2023-06-20', 'Descrição do Serviço E', '/anexos/servicoE.pdf', 1, 'Consultoria E', '1'),
  (UUID_TO_BIN(UUID()), 'Serviço F', '2023-05-15', '2023-05-20', '2023-05-30', 'Descrição do Serviço F', '/anexos/servicoF.docx', 0, 'Consultoria F', '0'),
  (UUID_TO_BIN(UUID()), 'Serviço G', '2023-04-03', '2023-04-10', '2023-04-20', 'Descrição do Serviço G', '/anexos/servicoG.xlsx', 1, 'Consultoria G', '2'),
  (UUID_TO_BIN(UUID()), 'Serviço H', '2023-03-25', '2023-03-30', '2023-04-05', 'Descrição do Serviço H', '/anexos/servicoH.txt', 0, 'Consultoria H', '1'),
  (UUID_TO_BIN(UUID()), 'Serviço I', '2023-02-15', '2023-02-20', '2023-02-25', 'Descrição do Serviço I', '/anexos/servicoI.pdf', 1, 'Consultoria I', '0'),
  (UUID_TO_BIN(UUID()), 'Serviço J', '2023-01-10', '2023-01-15', '2023-01-25', 'Descrição do Serviço J', '/anexos/servicoJ.jpg', 0, 'Consultoria J', '2')*/

  SELECT * FROM tb_servicos;
  SELECT *, BIN_TO_UUID(id_servicos) FROM tb_servicos;

  /*INSERT INTO tb_chamados (id_chamado, setor, nome_solicitante, chapa_profissional, data_criacao, data_inicio, data_termino, descricao_chamado, anexo, status_chamado, chapa_usuario) VALUES
  (UUID_TO_BIN(UUID()), 'TI', 'Sergio Bezerra' 'Carlos Silva', '2023-10-01', '2023-10-05', '2023-10-15', 'Problema na conexão de rede', '/anexos/chamado1.pdf', '0'),
  (UUID_TO_BIN(UUID()), 'Recursos Humanos', 'Ana Oliveira', '2023-09-15', '2023-09-20', '2023-09-30', 'Solicitação de férias', '/anexos/chamado2.docx', '1'),
  (UUID_TO_BIN(UUID()), 'Financeiro', 'Mariana Santos', '2023-08-10', '2023-08-15', '2023-08-25', 'Dúvida sobre desconto em folha', '/anexos/chamado3.jpg', '2'),
  (UUID_TO_BIN(UUID()), 'Produção', 'Lucas Ferreira', '2023-07-20', '2023-07-25', '2023-08-05', 'Máquina parada', '/anexos/chamado4.png', '0'),
  (UUID_TO_BIN(UUID()), 'Marketing', 'Fernanda Gomes', '2023-06-05', '2023-06-10', '2023-06-20', 'Solicitação de material promocional', '/anexos/chamado5.pdf', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'TI', 'Ricardo Alves', '2023-05-15', '2023-05-20', '2023-05-30', 'Problema no software de contabilidade', '/anexos/chamado6.docx', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Recursos Humanos', 'Mariana Martins', '2023-04-03', '2023-04-10', '2023-04-20', 'Atualização cadastral', '/anexos/chamado7.xlsx', 'Finalizado'),
  (UUID_TO_BIN(UUID()), 'Produção', 'André Oliveira', '2023-03-25', '2023-03-30', '2023-04-05', 'Problema na linha de produção', '/anexos/chamado8.txt', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Marketing', 'Juliana Santos', '2023-02-15', '2023-02-20', '2023-02-25', 'Pedido de análise de mercado', '/anexos/chamado9.pdf', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'TI', 'Daniel Pereira', '2023-01-10', '2023-01-15', '2023-01-25', 'Problema no servidor de email', '/anexos/chamado10.jpg', 'Finalizado');*/
  
 /* SELECT * FROM tb_chamados;
  SELECT BIN_TO_UUID(id_chamado) FROM tb_chamados;
  */
  INSERT INTO tb_hard_skills (id_hard_skill, nome_hard_skill) VALUES
  (UUID_TO_BIN('27b65a61-c096-11ee-847c-601895604814'), 'Java'),
  (UUID_TO_BIN('27b65ec0-c096-11ee-847c-601895604814'), 'Python'),
  (UUID_TO_BIN('27b65f2f-c096-11ee-847c-601895604814'), 'JavaScript'),
  (UUID_TO_BIN('27b65f65-c096-11ee-847c-601895604814'), 'C#'),
  (UUID_TO_BIN('27b65f9e-c096-11ee-847c-601895604814'), 'React'),
  (UUID_TO_BIN('27b65fd2-c096-11ee-847c-601895604814'), 'SQL'),
  (UUID_TO_BIN('27b66009-c096-11ee-847c-601895604814'), 'HTML'),
  (UUID_TO_BIN('27b6603a-c096-11ee-847c-601895604814'), 'CSS'),
  (UUID_TO_BIN('27b66074-c096-11ee-847c-601895604814'), 'Node.js'),
  (UUID_TO_BIN('27b660a7-c096-11ee-847c-601895604814'), 'Angular');
  
  SELECT * FROM tb_hard_skills;
  SELECT *, BIN_TO_UUID(id_hard_skill) FROM tb_hard_skills;

    
  INSERT INTO tb_usuarios (id_usuario, chapa_usuario, nome_usuario, email, senha, tipos_usuario) VALUES
  (UUID_TO_BIN('aa3e2ced-c091-11ee-847c-601895604814'), 1001, 'João Silva', 'joao@example.com', 'senha123', 'ADMIN'),
  (UUID_TO_BIN('aa3e43d8-c091-11ee-847c-601895604814'), 1002, 'Ana Pereira', 'ana@example.com', 'senha456', 'ADMIN'),
  (UUID_TO_BIN('aa3e45b3-c091-11ee-847c-601895604814'), 1003, 'Carlos Santos', 'carlos@example.com', 'senha789', 'ADMIN'),
  (UUID_TO_BIN('aa3e4631-c091-11ee-847c-601895604814'), 1004, 'Maria Rodrigues', 'maria@example.com', 'senhaabc', 'ADMIN'),
  (UUID_TO_BIN('aa3e4691-c091-11ee-847c-601895604814'), 1005, 'Lucas Ferreira', 'lucas@example.com', 'senha1234', 'ADMIN'),
  (UUID_TO_BIN('aa3e4713-c091-11ee-847c-601895604814'), 1006, 'Fernanda Gomes', 'fernanda@example.com', 'senha5678', 'ADMIN'),
  (UUID_TO_BIN('aa3e4776-c091-11ee-847c-601895604814'), 1007, 'Ricardo Alves', 'ricardo@example.com', 'senha90ab', 'ADMIN'),
  (UUID_TO_BIN('aa3e47f3-c091-11ee-847c-601895604814'), 1008, 'Mariana Martins', 'mariana@example.com', 'senhacdef', 'ADMIN'),
  (UUID_TO_BIN('aa3e485c-c091-11ee-847c-601895604814'), 1009, 'André Oliveira', 'andre@example.com', 'senhaghi', 'ADMIN'),
  (UUID_TO_BIN('aa3e48ce-c091-11ee-847c-601895604814'), 1010, 'Juliana Santos', 'juliana@example.com', 'senhajklm', 'ADMIN');
  
  SELECT *, BIN_TO_UUID(id_usuario) FROM tb_usuarios;
  SELECT BIN_TO_UUID(id_usuario) FROM tb_usuarios;
  
  INSERT INTO tb_profissionais (id_profissional, status_profissional, inicio_ferias, termino_ferias, jornada_trabalho_profissional, hora_extra, id_usuario) VALUES
  (UUID_TO_BIN('366a7b4a-c09a-11ee-847c-601895604814'), '0', NULL, NULL, 40, 0, UUID_TO_BIN('aa3e45b3-c091-11ee-847c-601895604814')),
  (UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), '1', NULL, NULL, 40, 0, UUID_TO_BIN('aa3e48ce-c091-11ee-847c-601895604814')),
  (UUID_TO_BIN('366d48f9-c09a-11ee-847c-601895604814'), '2', '2023-12-01', '2023-12-15', 30, 5, UUID_TO_BIN('aa3e4776-c091-11ee-847c-601895604814'));
  /*status_profissional ENUM('Ativo', 'Inativo', 'Férias', 'Afastado') NOT NULL,*/
  
  SELECT *, BIN_TO_UUID(id_profissional) FROM tb_profissionais;  
  SELECT BIN_TO_UUID(id_profissional) FROM tb_profissionais;
  SELECT *  FROM tb_profissionais INNER JOIN tb_usuarios ON tb_profissionais.id_profissional = tb_usuarios.id_usuario;
  
  INSERT INTO tb_profissionais_hardskills (id_profissionais_hardskills,id_profissional, id_hard_skill) VALUES
  (UUID_TO_BIN('8f5a5954-c155-11ee-847c-601895604814'), UUID_TO_BIN('366a7b4a-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b66009-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a6b92-c155-11ee-847c-601895604814'), UUID_TO_BIN('366a7b4a-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b6603a-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a6d0b-c155-11ee-847c-601895604814'), UUID_TO_BIN('366a7b4a-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65f2f-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a6dc4-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65f9e-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a6f24-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65ec0-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a703e-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b660a7-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a70e9-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d48f9-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65fd2-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a71bb-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d48f9-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65f65-c096-11ee-847c-601895604814')),
  (UUID_TO_BIN('8f5a7328-c155-11ee-847c-601895604814'), UUID_TO_BIN('366d48f9-c09a-11ee-847c-601895604814'), UUID_TO_BIN('27b65a61-c096-11ee-847c-601895604814'));


  SELECT *, BIN_TO_UUID(id_profissionais_hardskills) FROM tb_profissionais_hardskills;
  SELECT BIN_TO_UUID(id_profissional), BIN_TO_UUID(id_hard_skill) FROM tb_profissionais_hardskills;
  
  INSERT INTO tb_squads (id_squad, id_chamado, id_servicos) VALUES
  (UUID_TO_BIN('7a81496f-c153-11ee-847c-601895604814'), null, UUID_TO_BIN('bc42c2f1-c08e-11ee-847c-601895604814')), /*SERVICOS*/
  (UUID_TO_BIN('7a815766-c153-11ee-847c-601895604814'), null, UUID_TO_BIN('bc42c894-c08e-11ee-847c-601895604814')); /*SERVICOS*/
  /*(UUID_TO_BIN(UUID()), null, UUID_TO_BIN('2d95e09c-84c7-11ee-9889-60189550df2e'), /*SERVICOS*/
  /*(UUID_TO_BIN(UUID()), UUID_TO_BIN('2d992aac-84c7-11ee-9889-60189550df2e'), null), /*CHAMADO*/
  /*(UUID_TO_BIN(UUID()), UUID_TO_BIN('2d99302f-84c7-11ee-9889-60189550df2e'), null), /*CHAMADO*/
  /*(UUID_TO_BIN(UUID()), UUID_TO_BIN('2d99312f-84c7-11ee-9889-60189550df2e'), null); /*CHAMADO*/
  
  SELECT *, BIN_TO_UUID(id_squad) FROM tb_squads;
  SELECT BIN_TO_UUID(id_squad) FROM tb_squads;
  
  INSERT INTO tb_profissionais_squads (id_profissional, id_squad) VALUES
  (UUID_TO_BIN('366a7b4a-c09a-11ee-847c-601895604814'), UUID_TO_BIN('7a81496f-c153-11ee-847c-601895604814')),
  (UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), UUID_TO_BIN('7a81496f-c153-11ee-847c-601895604814')),
  (UUID_TO_BIN('366d45c6-c09a-11ee-847c-601895604814'), UUID_TO_BIN('7a815766-c153-11ee-847c-601895604814')),
  (UUID_TO_BIN('366d48f9-c09a-11ee-847c-601895604814'), UUID_TO_BIN('7a815766-c153-11ee-847c-601895604814'));

  
  SELECT * FROM tb_profissionais_squads;
  SELECT BIN_TO_UUID(id_profissional), BIN_TO_UUID(id_squad) FROM tb_profissionais_squads;
  
  INSERT INTO tb_dados_volkswagen (id_dados_volkswagen, chapa_usuario, nome_usuario, email, tipos_usuario) VALUES
  (UUID_TO_BIN('2d7869af-c154-11ee-847c-601895604814'), 1001, 'João Silva', 'joao@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d787b95-c154-11ee-847c-601895604814'), 1002, 'Ana Pereira', 'ana@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d787cf8-c154-11ee-847c-601895604814'), 1003, 'Carlos Santos', 'carlos@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d787dab-c154-11ee-847c-601895604814'), 1004, 'Maria Rodrigues', 'maria@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d787f2c-c154-11ee-847c-601895604814'), 1005, 'Lucas Ferreira', 'lucas@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d787fdb-c154-11ee-847c-601895604814'), 1006, 'Fernanda Gomes', 'fernanda@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d788086-c154-11ee-847c-601895604814'), 1007, 'Ricardo Alves', 'ricardo@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d78812c-c154-11ee-847c-601895604814'), 1008, 'Mariana Martins', 'mariana@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d7881f4-c154-11ee-847c-601895604814'), 1009, 'André Oliveira', 'andre@example.com', 'ADMIN'),
  (UUID_TO_BIN('2d7882bd-c154-11ee-847c-601895604814'), 1010, 'Juliana Santos', 'juliana@example.com', 'ADMIN');
  
  SELECT *, BIN_TO_UUID(id_dados_volkswagen) FROM tb_dados_volkswagen;