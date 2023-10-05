-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Creato il: Mar 29, 2019 alle 10:51
-- Versione del server: 5.7.25
-- Versione PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `placesofcity`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `activity`
--

CREATE TABLE `activity` (
  `id` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `longitude` varchar(255) NOT NULL,
  `latitude` varchar(255) NOT NULL,
  `image` varchar(255) NOT NULL,
  `street` varchar(255) NOT NULL,
  `profile` varchar(255) NOT NULL,
  `weather` varchar(255) NOT NULL,
  `start_hour` time NOT NULL,
  `end_hour` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `activity`
--

INSERT INTO `activity` (`id`, `city`, `name`, `phone`, `longitude`, `latitude`, `image`, `street`, `profile`, `weather`, `start_hour`, `end_hour`) VALUES
(1, 1, '99 Cannelle', '', '13.389490000000023', '42.34986', 'https://www.hotelfedericosecondo.it/Resource/attrazioni/fontana-99-cannelle.jpg', 'Piazza San Vito', 'NERD', 'CLEAR CLOUDS', '00:00:00', '00:00:00'),
(2, 1, 'Colle Maggio', '', '13.404684999999972', '42.3427127', 'https://www.turismo.it/typo3temp/pics/ba0445e465.jpg', 'Via Colle Maggio', 'NERD', 'CLOUDS RAIN SNOW CLEAR', '08:00:00', '18:00:00'),
(3, 1, 'Museo nazionale Abruzzo', '', '13.318697100000009', '42.3049262', 'https://media-cdn.tripadvisor.com/media/photo-s/01/89/f5/61/caption.jpg', 'Via Tornimparte', 'NERD', 'CLOUDS RAIN SNOW CLEAR', '08:30:00', '19:00:00'),
(4, 1, 'Santuario madonna d’appari', '', '13.473670900000002', '42.3624693', 'http://www.abruzzoparchi.it/collane/madonnappari/immagini/dsc_0011.jpg', 'SS17bis', 'NERD', 'CLEAR CLOUDS', '05:00:00', '23:00:00'),
(5, 1, 'Forte spagnolo', '', '13.402602099999967', '42.3525448', 'https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Castello_500.JPG/1200px-Castello_500.JPG', 'Via Castello', 'NERD', 'CLEAR CLOUDS', '08:30:00', '20:00:00'),
(6, 1, 'Basilica S.Berardino', '', '13.40080660000001', '42.3504956', 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Basilica_di_San_Bernardino_%28facciata%29.jpg/225px-Basilica_di_San_Bernardino_%28facciata%29.jpg', 'Via S. Bernardino', 'NERD', 'CLEAR CLOUDS RAIN SNOW', '08:00:00', '18:00:00'),
(7, 1, 'Necropoli fossa', '', '13.50921070000004', '42.3085986', 'https://www.italiaparchi.it/public/img/data/860FA97D2F1128C485208A61995165E7.jpg', 'Via S. Massimo d\'Aveja', 'NERD', 'CLEAR CLOUDS', '08:00:00', '18:00:00'),
(8, 1, 'Anbra-anonima Brasseria Aquilana', '', '13.399127700000008', '42.3534741', 'https://media-cdn.tripadvisor.com/media/photo-s/0d/2c/43/cf/tris-di-degustazione.jpg', 'Via Giuseppe Garibaldi 49', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '18:00:00', '02:00:00'),
(9, 1, 'Public Enemy- Gastro Pub', '', '13.399863200000027', '42.3533349', 'https://scontent-mxp1-1.xx.fbcdn.net/v/t1.0-9/46463279_2161296170751090_5047283169250770944_o.jpg?_nc_cat=106&_nc_ht=scontent-mxp1-1.xx&oh=b27046e03be6889ac94aae53352e1715&oe=5D013E7E', 'Via Giuseppe Garibaldi 27', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '18:00:00', '02:00:00'),
(10, 1, 'Fiume Vera', '', '13.458853099999942', '42.3676421', 'http://www.abruzzoparchi.it/sorgentivera/immagini/vacanza_ferragosto_2009%20051.JPG', 'Fiume Vera', 'ADVENTURE', 'CLEAR CLOUDS', '00:00:00', '00:00:00'),
(11, 1, 'Parco del castello', '', '13.406620800000042', '42.3538311', 'https://www.ilmessaggero.it/photos/MED/82/93/1558293_parco_castello_2.jpg', 'Viale Tagliacozzo', 'ADVENTURE', 'CLEAR CLOUDS', '00:00:00', '00:00:00'),
(12, 1, 'All Beers Bar', '', '13.394714300000032', '42.3565366', 'http://www.monthys.it/s/img/emotionheader_1.jpg?1511438625.960px.443px', 'Viale Croce Rossa 40', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '18:00:00', '02:00:00'),
(13, 1, 'Arrosticini Divini', '', '13.401627800000028', '42.3527323', 'http://www.iloveitalianfood.it/wp-content/uploads/2017/07/1.716Arrosticini-di-agnello.jpg', 'Via Castello', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '12:00:00', '01:00:00'),
(14, 1, 'Pineta di Roio', '', '13.38000999999997', '42.33239', 'https://www.abruzzonews.eu/wp-content/uploads/2015/11/PINETA-GABBIA-DEL-LUPO-NOVEMBRE-2015.jpg', 'Via della Pineta 1', 'ADVENTURE', 'CLEAR CLOUDS ', '00:00:00', '00:00:00'),
(15, 1, 'Grotta Ciccio felice', '', '13.38000999999997', '42.33239', 'http://www.ilcentro.it/image/policy:1.498913:1490976160/Un-146-immagine-della-grotta-di-Ciccio-Felice.jpg?f=2x1&$p$f=bb1392f&w=1500&$w=f075b93', 'Avezzano', 'ADVENTURE', 'CLEAR CLOUDS ', '07:00:00', '19:00:00'),
(16, 1, 'Castello di Ocre', '', '13.484916999999996', '42.2963127', 'http://www.valleaquila.it/images/da-vedere-all-aquila/castello-di-ocre_.jpg', 'Via del Convento', 'NERD', 'CLEAR CLOUDS RAIN SNOW', '08:00:00', '20:00:00'),
(17, 1, 'Fontana luminosa', '', '13.401623500000028', '42.3540302', 'https://media-cdn.tripadvisor.com/media/photo-s/0e/08/16/70/fontana-luminosa.jpg', 'Piazza Battaglione degli Alpini', 'NERD', 'CLEAR CLOUDS RAIN SNOW', '21:00:00', '05:00:00'),
(19, 1, 'Il primo papavero', '', '13.400565899999947', '42.3503993', 'http://img.pgol.it/img/Z6/46/19/38/1/13960795.jpg', 'Via S. Bernardino 9', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '19:45:00', '23:00:00'),
(20, 1, 'Magione Papale Gourmet', '', '13.40510960000006', '42.3379924', 'https://guida.michelin.it/sites/mtpb2c_it/files/styles/poi_detail_landscape/public/292344_2.jpg?itok=aP9lDavm', 'Via Porta Napoli 67/1', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '12:00:00', '24:00:00'),
(21, 1, 'Casetta nel parco', '', '13.359344400000055', '42.3472211', 'https://media-cdn.tripadvisor.com/media/photo-s/05/18/ec/bc/casetta-nel-parco.jpg', 'Strada Vicinale dell\'Aterno 33', 'TASTY', 'CLEAR CLOUDS RAIN', '12:45:00', '24:00:00'),
(22, 1, 'Osteria Corridore', '', '13.406268100000034', '42.3325545', 'http://bennyland.altervista.org/wp-content/uploads/2015/10/IMG-20150923-WA0002.jpg', 'Viale Colle Verde', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '12:30:00', '24:00:00'),
(23, 1, 'Villa Magi', '', '13.403688800000054', '42.3284769', 'https://cdn0.matrimonio.com/emp/fotos/7/0/0/6/sav-2989_2_67006.jpg', 'Via dell\'Allodola 10', 'TASTY', 'CLEAR CLOUDS RAIN SNOW', '20:00:00', '01:00:00'),
(24, 1, 'Area archeologica amiternum', '', '13.314238400000022', '42.3970865', 'http://www.virtuquotidiane.it/wp-content/uploads/2017/05/amiternum-1024x560.jpg', 'Frazione S. Vittorino', 'ADVENTURE', 'CLEAR CLOUDS ', '08:00:00', '19:00:00'),
(25, 1, 'Shenandoah ranch', '', '13.63627150000002', '42.1256317', 'https://media-cdn.tripadvisor.com/media/photo-s/10/b2/b7/be/gara-di-circuito-con.jpg', 'Via del Pago', 'ADVENTURE', 'CLEAR CLOUDS SNOW RAIN', '08:00:00', '23:00:00'),
(26, 1, 'Escape room', '', '13.38884459999997', '42.3570728', 'https://www.aprireinfranchising.it/useruploads/images/eventi/game-over-escape-rooms-franchising-4.jpg', 'Viale Croce Rossa 185', 'ADVENTURE', 'CLEAR CLOUDS RAIN SNOW', '17:00:00', '00:00:00'),
(27, 1, 'Parco avventura', '', '13.522643799999969', '42.4260855', 'http://www.ilregnodeimazzamurelli.it/wp-content/uploads/2015/09/3.jpg', 'SS17 bis', 'ADVENTURE', 'CLEAR CLOUDS', '10:00:00', '18:00:00'),
(28, 1, 'Natura in Quad', '', '13.51742999999999', '42.1389723', 'http://www.teleaesse.it/wp-content/uploads/bfi_thumb/quad-6l773bmhtl4kp40yhcgy2erayz98aaxuw6e7r6w19vj.jpg', 'Ovindoli', 'ADVENTURE', 'CLEAR CLOUDS', '10:00:00', '19:00:00'),
(29, 1, 'Parco del Colonnello', '', '13.080028399999946', '42.0964281', 'https://www.ilparcodelcolonnello.it/images/slideshow-home/bambino-su-ponte-parco-avventura-web.jpg', 'Via degli Alpini', 'ADVENTURE', 'CLEAR CLOUDS ', '10:00:00', '19:00:00'),
(30, 1, 'Bowling La Sfera', '', '13.395530000000008', '42.352738', 'https://www.google.com/search?q=AMERICAN+BOWLING++L%27AQUILA&hl=it&source=lnms&tbm=isch&sa=X&ved=0ahUKEwimmo7U1v7fAhXwMewKHXXdDHQQ_AUIDygC#imgrc=wafyFkwllPXqYM:', 'Via Sandro Pertini 120', 'ADVENTURE', 'CLEAR CLOUDS RAIN SNOW', '16:30:00', '24:00:00'),
(31, 1, 'Museo archeologico s.maria', '', '13.40025300000002', '42.35157359999999', 'http://www.ilcentro.it/image/policy:1.124881:1491453568/011-B-WEB.jpg?f=2x1&$p$f=dfd3872&w=1500&$w=f075b93', 'Via Vittorio Emanuele', 'NERD', 'CLEAR CLOUDS RAIN SNOW', '08:00:00', '20:00:00'),
(35, 1, 'Teatro Romano di amiternum', '', '13.31249790000004', '42.39756939999999', 'http://www.beniculturali.it/mibac/multimedia/MiBAC/images/med/72/7bf5b437135b112dcdf676d8eaa750254b4530b0.JPG', 'SS80', 'NERD', 'CLEAR CLOUDS', '07:00:00', '21:00:00');

-- --------------------------------------------------------

--
-- Struttura della tabella `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `longitude` varchar(255) NOT NULL,
  `latitude` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `city`
--

INSERT INTO `city` (`id`, `name`, `longitude`, `latitude`) VALUES
(1, 'Aquila', '13.349552899999935', '42.3676833');

-- --------------------------------------------------------

--
-- Struttura della tabella `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `id_activity` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `text` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `comments`
--

INSERT INTO `comments` (`id`, `id_activity`, `user`, `title`, `text`) VALUES
(1, 1, 1, 'asdas', 'asdsad'),
(2, 1, 1, 'ciao', 'commento'),
(3, 1, 1, 'provarest', 'prova'),
(4, 1, 1, 'zxczxczx', 'undefined'),
(5, 1, 1, 'fsdfsd', 'fdsfdsfdsfdsfsdfdsf'),
(6, 1, 1, 'Primo commento da interfaccia', 'Primo commento'),
(7, 1, 1, 'altro commento', 'eccomi un nuovo commento'),
(8, 1, 1, 'eccooooooooooooo', 'ancora uno'),
(9, 24, 1, 'il rimo commento per area archeologica amiternum', 'sdfsdfsdfsd'),
(10, 24, 1, 'nuovo commento ', 'commento'),
(11, 1, 1, 'ciao commento', 'commento'),
(12, 35, 1, 'prova soap', 'soap'),
(13, 1, 1, 'ultimo commento', 'ecco il mio commento per le 99 cannelle'),
(14, 1, 2, 'visita', 'ho visitato le 99 cannelle... non sono 99'),
(15, 21, 1, 'commento', 'commento per casetta nel parco');

-- --------------------------------------------------------

--
-- Struttura della tabella `likes`
--

CREATE TABLE `likes` (
  `id_user` int(11) NOT NULL,
  `id_activity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `likes`
--

INSERT INTO `likes` (`id_user`, `id_activity`) VALUES
(1, 1),
(1, 2),
(1, 6),
(1, 13),
(1, 24),
(2, 1),
(2, 16),
(2, 21),
(2, 24);

-- --------------------------------------------------------

--
-- Struttura della tabella `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `keystring` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `users`
--

INSERT INTO `users` (`id`, `name`, `surname`, `email`, `password`, `keystring`) VALUES
(1, 'Marco', 'Di Natale', 'dinatalemarco90@gmail.com', '123456789', 'dhsjgfhjdsfjhdsgfhjdsgjhf'),
(2, 'Cristina', 'Ciavarro', 'cristina.ciavarro@gmail.com', '12345', 'safhkadsbfjdsagfjhasdbhjfdsa'),
(18, 'dfsdf', 'sdfdsf', 'sdfsdf', 'sdfdsf', 'fosW22FqNcGpueKwEeWq'),
(19, 'sdfsdf', 'sdfsdf', 'dsfdsf', 'dsfds', 'MU7MF1VMjnmjMAnZLClb'),
(20, 'asdsad', 'asdsad', 'sadasd', 'asdas', 'VsgTaGvAzlKpSjyyPgVp'),
(21, 'utente', 'utentNINO', 'ut.NINO.utentino@utente.ut', '1234', 'P4iV2eQgyFw4wxZOEUTe');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`id`),
  ADD KEY `city` (`city`);

--
-- Indici per le tabelle `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user` (`user`),
  ADD KEY `id_activity` (`id_activity`);

--
-- Indici per le tabelle `likes`
--
ALTER TABLE `likes`
  ADD PRIMARY KEY (`id_user`,`id_activity`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_activity` (`id_activity`);

--
-- Indici per le tabelle `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `activity`
--
ALTER TABLE `activity`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT per la tabella `city`
--
ALTER TABLE `city`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT per la tabella `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT per la tabella `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `activity`
--
ALTER TABLE `activity`
  ADD CONSTRAINT `activity_ibfk_1` FOREIGN KEY (`city`) REFERENCES `city` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`user`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`id_activity`) REFERENCES `activity` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `likes`
--
ALTER TABLE `likes`
  ADD CONSTRAINT `likes_ibfk_1` FOREIGN KEY (`id_activity`) REFERENCES `activity` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `likes_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`);
