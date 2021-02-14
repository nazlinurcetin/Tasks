

name1=input('Player 1 Nickname: ','s');
name2=input('Player 2 Nickname: ','s');

fprintf(' --------|| Game is Starting ||-------- \n');

player1choice=input([name1, ' Turn: '],'s');
player2choice=input([name2, ' Turn: '],'s');

if (player1choice == 'rock')
    player1choice='1';
end
if (player1choice == 'paper')
    player1choice='2';
end
if (player1choice == 'scissors')
    player1choice='3';
end

if (player1choice == player2choice)
    fprintf('The game is draw!');
elseif ( player1choice == '1' && player2choice == '2')
    fprintf(' --------||       WINNER     ||-------- \n');
    fprintf([name1 ,' is the winner!! \n']);
elseif (player1choice == '2' && player2choice == '1')
    fprintf(' --------||       WINNER     ||-------- \n');
    fprintf([name1 ,' is the winner!! \n']);
elseif (player1choice == '3' && player2choice == '2')
    fprintf(' --------||       WINNER     ||-------- \n');
    fprintf([name1 ,' is the winner!! \n']);
else 
    fprintf(' --------||       WINNER     ||-------- \n');
    fprintf([name2 ,' is the winner!! \n']);
end
