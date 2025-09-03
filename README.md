[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/cy7r8jGu)
# DIP — Notificador (testes falham inicialmente)

`EmailNotifier` instancia `SmtpClient` diretamente. `SmtpClient` lança erro se `SMTP_AVAILABLE` não for `"true"`.  
O teste seta `DRY_RUN=true` e espera que **não lance** (no design DIP, você usará um remetente abstrato/Noop).  

## Tarefa
- Introduza uma abstração (`MailSender`) e respeite `DRY_RUN=true` para não usar SMTP real.

## Rodar
```bash
mvn -q test
```
