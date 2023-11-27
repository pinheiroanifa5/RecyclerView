# RecyclerView

Utilização do RecyclerView

Este app demonstra o uso básico do RecyclerView para apresentar uma lista de itens na interface.

Configuração

O RecyclerView é obtido via ID no layout XML da activity e configurado com um layout manager vertical:
recyclerView.setLayoutManager(new LinearLayoutManager(this))

Adapter
O adapter padrão é extendido para vincular os dados a cada linha da lista:
class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder>

ViewHolder
Responsável por encontrar as views de cada item e anexar com os dados do modelo.

Modelo de Dados
A classe ListElement representa os dados de cada linha, contendo as propriedades: cor, nome e status.

A lista de itens é criada e passada para o adapter, que os exibe no RecyclerView.

Utilização do CardView
Cada item da lista é apresentado dentro de um CardView por questão de estilo, O CardView possui cantos arredondados e sombra para destacar cada item:
 app:cardCornerRadius="4dp"
 app:cardElevation="4dp"

Dessa forma os itens terão aparência e estilo padronizados, graças ao CardView encapsulando cada linha da lista no RecyclerView.
Os demais elementos como ViewHolder e Adapter permanecem os mesmos. Esta é apenas uma customização visual e de estilo.
