USE bd_maneasy;

INSERT INTO tb_servicos (id_servicos, nome_servicos, data_criacao, data_inicio, data_termino, descricao_servicos, anexo, tipo_servicos, consultoria, status_servicos) VALUES
  (UUID_TO_BIN(UUID()), 'Serviço A', '2023-10-01', '2023-10-05', '2023-10-15', 'Descrição do Serviço A', '/anexos/servicoA.pdf', 1, 'Consultoria A', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Serviço B', '2023-09-15', '2023-09-20', '2023-09-30', 'Descrição do Serviço B', '/anexos/servicoB.docx', 0, 'Consultoria B', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Serviço C', '2023-08-10', '2023-08-15', '2023-08-25', 'Descrição do Serviço C', '/anexos/servicoC.jpg', 1, 'Consultoria C', 'Finalizado'),
  (UUID_TO_BIN(UUID()), 'Serviço D', '2023-07-20', '2023-07-25', '2023-08-05', 'Descrição do Serviço D', '/anexos/servicoD.png', 0, 'Consultoria D', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Serviço E', '2023-06-05', '2023-06-10', '2023-06-20', 'Descrição do Serviço E', '/anexos/servicoE.pdf', 1, 'Consultoria E', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Serviço F', '2023-05-15', '2023-05-20', '2023-05-30', 'Descrição do Serviço F', '/anexos/servicoF.docx', 0, 'Consultoria F', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Serviço G', '2023-04-03', '2023-04-10', '2023-04-20', 'Descrição do Serviço G', '/anexos/servicoG.xlsx', 1, 'Consultoria G', 'Finalizado'),
  (UUID_TO_BIN(UUID()), 'Serviço H', '2023-03-25', '2023-03-30', '2023-04-05', 'Descrição do Serviço H', '/anexos/servicoH.txt', 0, 'Consultoria H', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Serviço I', '2023-02-15', '2023-02-20', '2023-02-25', 'Descrição do Serviço I', '/anexos/servicoI.pdf', 1, 'Consultoria I', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Serviço J', '2023-01-10', '2023-01-15', '2023-01-25', 'Descrição do Serviço J', '/anexos/servicoJ.jpg', 0, 'Consultoria J', 'Finalizado');

  SELECT * FROM tb_servicos;
  SELECT BIN_TO_UUID(id_servicos) FROM tb_servicos;

  
  INSERT INTO tb_chamados (id_chamado, setor, nome_solicitante, data_criacao, data_inicio, data_termino, descricao_chamado, anexo, status_chamado) VALUES
  (UUID_TO_BIN(UUID()), 'TI', 'Carlos Silva', '2023-10-01', '2023-10-05', '2023-10-15', 'Problema na conexão de rede', '/anexos/chamado1.pdf', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Recursos Humanos', 'Ana Oliveira', '2023-09-15', '2023-09-20', '2023-09-30', 'Solicitação de férias', '/anexos/chamado2.docx', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Financeiro', 'Mariana Santos', '2023-08-10', '2023-08-15', '2023-08-25', 'Dúvida sobre desconto em folha', '/anexos/chamado3.jpg', 'Finalizado'),
  (UUID_TO_BIN(UUID()), 'Produção', 'Lucas Ferreira', '2023-07-20', '2023-07-25', '2023-08-05', 'Máquina parada', '/anexos/chamado4.png', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Marketing', 'Fernanda Gomes', '2023-06-05', '2023-06-10', '2023-06-20', 'Solicitação de material promocional', '/anexos/chamado5.pdf', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'TI', 'Ricardo Alves', '2023-05-15', '2023-05-20', '2023-05-30', 'Problema no software de contabilidade', '/anexos/chamado6.docx', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'Recursos Humanos', 'Mariana Martins', '2023-04-03', '2023-04-10', '2023-04-20', 'Atualização cadastral', '/anexos/chamado7.xlsx', 'Finalizado'),
  (UUID_TO_BIN(UUID()), 'Produção', 'André Oliveira', '2023-03-25', '2023-03-30', '2023-04-05', 'Problema na linha de produção', '/anexos/chamado8.txt', 'Em andamento'),
  (UUID_TO_BIN(UUID()), 'Marketing', 'Juliana Santos', '2023-02-15', '2023-02-20', '2023-02-25', 'Pedido de análise de mercado', '/anexos/chamado9.pdf', 'Aberto'),
  (UUID_TO_BIN(UUID()), 'TI', 'Daniel Pereira', '2023-01-10', '2023-01-15', '2023-01-25', 'Problema no servidor de email', '/anexos/chamado10.jpg', 'Finalizado');
  
  SELECT * FROM tb_chamados;
  SELECT BIN_TO_UUID(id_chamado) FROM tb_chamados;
  
  INSERT INTO tb_hard_skills (id_hard_skill, nome_hard_skill) VALUES
  (UUID_TO_BIN(UUID()), 'Java'),
  (UUID_TO_BIN(UUID()), 'Python'),
  (UUID_TO_BIN(UUID()), 'JavaScript'),
  (UUID_TO_BIN(UUID()), 'C#'),
  (UUID_TO_BIN(UUID()), 'React'),
  (UUID_TO_BIN(UUID()), 'SQL'),
  (UUID_TO_BIN(UUID()), 'HTML'),
  (UUID_TO_BIN(UUID()), 'CSS'),
  (UUID_TO_BIN(UUID()), 'Node.js'),
  (UUID_TO_BIN(UUID()), 'Angular');
  
  SELECT * FROM tb_hard_skills;
  SELECT BIN_TO_UUID(id_hard_skill) FROM tb_hard_skills;

    
  INSERT INTO tb_usuarios (id_usuario, chapa_usuario, nome_usuario, email, senha, tipos_usuario) VALUES
  (UUID_TO_BIN(UUID()), 1001, 'João Silva', 'joao@example.com', 'senha123', 'Administrador'),
  (UUID_TO_BIN(UUID()), 1002, 'Ana Pereira', 'ana@example.com', 'senha456', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1003, 'Carlos Santos', 'carlos@example.com', 'senha789', 'Profissional'),
  (UUID_TO_BIN(UUID()), 1004, 'Maria Rodrigues', 'maria@example.com', 'senhaabc', 'Comum'),
  (UUID_TO_BIN(UUID()), 1005, 'Lucas Ferreira', 'lucas@example.com', 'senha1234', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1006, 'Fernanda Gomes', 'fernanda@example.com', 'senha5678', 'Profissional'),
  (UUID_TO_BIN(UUID()), 1007, 'Ricardo Alves', 'ricardo@example.com', 'senha90ab', 'Administrador'),
  (UUID_TO_BIN(UUID()), 1008, 'Mariana Martins', 'mariana@example.com', 'senhacdef', 'Comum'),
  (UUID_TO_BIN(UUID()), 1009, 'André Oliveira', 'andre@example.com', 'senhaghi', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1010, 'Juliana Santos', 'juliana@example.com', 'senhajklm', 'Profissional');
  
  SELECT * FROM tb_usuarios;
  
  SELECT BIN_TO_UUID(id_usuario) FROM tb_usuarios;
  
  INSERT INTO tb_profisionais (id_profissional, status_profissional, inicio_ferias, termino_ferias, jornada_trabalho_profissional, hora_extra, id_usuario) VALUES
  (UUID_TO_BIN('2d9db3f5-84c7-11ee-9889-60189550df2e'), 'Ativo', NULL, NULL, 40, 0, UUID_TO_BIN('2d9db3f5-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9db9ee-84c7-11ee-9889-60189550df2e'), 'Inativo', NULL, NULL, 40, 0, UUID_TO_BIN('2d9db9ee-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbafc-84c7-11ee-9889-60189550df2e'), 'Férias', '2023-12-01', '2023-12-15', 30, 5, UUID_TO_BIN('2d9dbafc-84c7-11ee-9889-60189550df2e'));
  
  SELECT * FROM tb_profisionais;  
  SELECT BIN_TO_UUID(id_profissional) FROM tb_profisionais;
  SELECT *  FROM tb_profisionais INNER JOIN tb_usuarios ON tb_profisionais.id_profissional = tb_usuarios.id_usuario;
  
  INSERT INTO tb_profisionais (id_profissional, status_profissional, inicio_ferias, termino_ferias, jornada_trabalho_profissional, hora_extra, id_usuario) VALUES
  (UUID_TO_BIN('2d9dbbb7-84c7-11ee-9889-60189550df2e'), 'Ativo', NULL, NULL, 40, 0, UUID_TO_BIN('2d9dbbb7-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbc5d-84c7-11ee-9889-60189550df2e'), 'Inativo', NULL, NULL, 40, 0, UUID_TO_BIN('2d9dbc5d-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbcfc-84c7-11ee-9889-60189550df2e'), 'Férias', '2023-12-01', '2023-12-15', 30, 5, UUID_TO_BIN('2d9dbcfc-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbd96-84c7-11ee-9889-60189550df2e'), 'Afastado', NULL, NULL, 20, 0, UUID_TO_BIN('2d9dbd96-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbe32-84c7-11ee-9889-60189550df2e'), 'Ativo', NULL, NULL, 35, 2, UUID_TO_BIN('2d9dbe32-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbed6-84c7-11ee-9889-60189550df2e'), 'Inativo', NULL, NULL, 40, 0, UUID_TO_BIN('2d9dbed6-84c7-11ee-9889-60189550df2e')),
  (UUID_TO_BIN('2d9dbf64-84c7-11ee-9889-60189550df2e'), 'Férias', '2023-11-01', '2023-11-15', 30, 3, UUID_TO_BIN('2d9dbf64-84c7-11ee-9889-60189550df2e'));
  
  SELECT * FROM tb_profisionais;  
  SELECT BIN_TO_UUID(id_profissional) FROM tb_profisionais;
  SELECT *  FROM tb_profisionais INNER JOIN tb_usuarios ON tb_profisionais.id_profissional = tb_usuarios.id_usuario;
  
  INSERT INTO tb_profissionais_hardskills (id_profissional, id_hard_skill) VALUES
  (UUID_TO_BIN('2d9db3f584c711ee988960189550df2e'), UUID_TO_BIN('2d9af7a084c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9db3f584c711ee988960189550df2e'), UUID_TO_BIN('2d9afad484c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9db9ee84c711ee988960189550df2e'), UUID_TO_BIN('2d9afb5684c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9db9ee84c711ee988960189550df2e'), UUID_TO_BIN('2d9afba284c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbafc84c711ee988960189550df2e'), UUID_TO_BIN('2d9afbf084c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbafc84c711ee988960189550df2e'), UUID_TO_BIN('2d9afc3684c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbbb784c711ee988960189550df2e'), UUID_TO_BIN('2d9afc7a84c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbbb784c711ee988960189550df2e'), UUID_TO_BIN('2d9afcca84c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbc5d84c711ee988960189550df2e'), UUID_TO_BIN('2d9afd1084c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbc5d84c711ee988960189550df2e'), UUID_TO_BIN('2d9afd5184c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbcfc84c711ee988960189550df2e'), UUID_TO_BIN('2d9afd5184c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbcfc84c711ee988960189550df2e'), UUID_TO_BIN('2d9afd1084c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbd9684c711ee988960189550df2e'), UUID_TO_BIN('2d9afb5684c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbd9684c711ee988960189550df2e'), UUID_TO_BIN('2d9afb5684c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbe3284c711ee988960189550df2e'), UUID_TO_BIN('2d9afcca84c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbe3284c711ee988960189550df2e'), UUID_TO_BIN('2d9afc7a84c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbed684c711ee988960189550df2e'), UUID_TO_BIN('2d9afb5684c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbed684c711ee988960189550df2e'), UUID_TO_BIN('2d9afbf084c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbf6484c711ee988960189550df2e'), UUID_TO_BIN('2d9afc7a84c711ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbf6484c711ee988960189550df2e'), UUID_TO_BIN('2d9afbf084c711ee988960189550df2e'));
  
INSERT INTO tb_profissionais_hardskills (id_profissionais_hardskills, id_profissional, id_hard_skill) VALUES
(UUID_TO_BIN(UUID()), UUID_TO_BIN('2d9dbf6484c711ee988960189550df2e'), UUID_TO_BIN('2d9afbf084c711ee988960189550df2e'));

  SELECT BIN_TO_UUID(id_profissionais_hardskills) FROM tb_profissionais_hardskills;
  
  SELECT * FROM tb_profissionais_hardskills;
  SELECT BIN_TO_UUID(id_profissional), BIN_TO_UUID(id_hard_skill) FROM tb_profissionais_hardskills;
  
  SELECT * FROM tb_profisionais INNER JOIN tb_profissionais_hardskills ON tb_profisionais.id_profissional = tb_profissionais_hardskills.id_profissional INNER JOIN tb_hard_skills ON tb_profissionais_hardskills.id_hard_skill = tb_hard_skills.id_hard_skill;

  INSERT INTO tb_squads (id_squad, id_chamado, id_servicos) VALUES
  (UUID_TO_BIN(UUID()), null, UUID_TO_BIN('2d92d2b9-84c7-11ee-9889-60189550df2e')), /*SERVICOS*/
  (UUID_TO_BIN(UUID()), null, UUID_TO_BIN('2d95dec4-84c7-11ee-9889-60189550df2e')), /*SERVICOS*/
  (UUID_TO_BIN(UUID()), null, UUID_TO_BIN('2d95e09c-84c7-11ee-9889-60189550df2e')), /*SERVICOS*/
  (UUID_TO_BIN(UUID()), UUID_TO_BIN('2d992aac-84c7-11ee-9889-60189550df2e'), null), /*CHAMADO*/
  (UUID_TO_BIN(UUID()), UUID_TO_BIN('2d99302f-84c7-11ee-9889-60189550df2e'), null), /*CHAMADO*/
  (UUID_TO_BIN(UUID()), UUID_TO_BIN('2d99312f-84c7-11ee-9889-60189550df2e'), null); /*CHAMADO*/
  
  SELECT * FROM tb_squads;
  SELECT BIN_TO_UUID(id_squad) FROM tb_squads;
  
  INSERT INTO tb_profissionais_squads (id_profissional, id_squad) VALUES
  (UUID_TO_BIN('2d9db3f584c711ee988960189550df2e'), UUID_TO_BIN('13f84d3a88bf11ee988960189550df2e')),
  (UUID_TO_BIN('2d9db9ee84c711ee988960189550df2e'), UUID_TO_BIN('13fb9e2188bf11ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbafc84c711ee988960189550df2e'), UUID_TO_BIN('13fba08488bf11ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbbb784c711ee988960189550df2e'), UUID_TO_BIN('13fba1ef88bf11ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbc5d84c711ee988960189550df2e'), UUID_TO_BIN('13fba31988bf11ee988960189550df2e')),
  (UUID_TO_BIN('2d9dbcfc84c711ee988960189550df2e'), UUID_TO_BIN('13fba3de88bf11ee988960189550df2e'));
  
  SELECT * FROM tb_profissionais_squads;
  SELECT BIN_TO_UUID(id_profissional), BIN_TO_UUID(id_squad) FROM tb_profissionais_squads;
  
  INSERT INTO tb_dados_volkswagen (id_dados_volkswagen, chapa_usuario, nome_usuario, email, tipos_usuario) VALUES
  (UUID_TO_BIN(UUID()), 1001, 'João Silva', 'joao@example.com', 'Administrador'),
  (UUID_TO_BIN(UUID()), 1002, 'Ana Pereira', 'ana@example.com', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1003, 'Carlos Santos', 'carlos@example.com', 'Profissional'),
  (UUID_TO_BIN(UUID()), 1004, 'Maria Rodrigues', 'maria@example.com', 'Comum'),
  (UUID_TO_BIN(UUID()), 1005, 'Lucas Ferreira', 'lucas@example.com', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1006, 'Fernanda Gomes', 'fernanda@example.com', 'Administrador'),
  (UUID_TO_BIN(UUID()), 1007, 'Ricardo Alves', 'ricardo@example.com', 'Comum'),
  (UUID_TO_BIN(UUID()), 1008, 'Mariana Martins', 'mariana@example.com', 'Profissional'),
  (UUID_TO_BIN(UUID()), 1009, 'André Oliveira', 'andre@example.com', 'Gestor'),
  (UUID_TO_BIN(UUID()), 1010, 'Juliana Santos', 'juliana@example.com', 'Administrador');
  
  SELECT * FROM tb_dados_volkswagen;

