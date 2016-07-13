# Chain of Responsibility Pattern

Faz parte do grupo Behavioral Pattern. Esse pattern separa o remetente e destinatário de uma request baseado no tipo de request. Cada destinatário tem refência ao próximo. Se o objeto não consegue lidar com a request, ele passo ao próximo destinatário.