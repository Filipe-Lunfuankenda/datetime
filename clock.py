import PySimpleGUI as sg
import datetime

#Definir a fonte para o relógio
fonte = ('Helvetica', 20)

#Layout da Janela
layout = [
    [sg.Text('Relógio Digital', font=fonte, justification='center')],
    [sg.Text('', size=(18,1), font=fonte, key='-DATA-')],
    [sg.Text('', size=(18,1), font=fonte, key='-HORA-')],
]

#Criar a janela
janela = sg.Window('Relógio Digital', layout, finalize=True)

#Loop para atualizar o relógio
while True:
    #Capturar o evento da janela
    evento, valores = janela.read(timeout=1000)

    #Verificar se o usuário fechou a janela
    if evento == sg.WIN_CLOSED:
        break

    #Obter a data e hora atual
    agora = datetime.datetime.now()

    #Formatar a data e hora
    data_formatada = agora.strftime('%d/%m/%Y')
    hora_formatada = agora.strftime('%H:%M:%S')

    #Atualizar os elementos da interface
    janela['-DATA-'].update(data_formatada)
    janela['-HORA-'].update(hora_formatada)

    #Fechar a janela ao sair do loop
janela.close()