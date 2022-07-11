-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 11 Jul 2022 pada 18.41
-- Versi server: 5.7.33
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `telebot-pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `chats`
--

CREATE TABLE `chats` (
  `id` char(7) NOT NULL,
  `category` char(1) NOT NULL,
  `sender` varchar(16) NOT NULL,
  `message` text NOT NULL,
  `created_at` timestamp NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `chats`
--

INSERT INTO `chats` (`id`, `category`, `sender`, `message`, `created_at`) VALUES
('AAD006I', 'O', 'admin', 'hi', '2022-07-02 16:18:48'),
('ABH647J', 'I', 'iwan', 'Hi', '2022-06-30 21:32:33'),
('ACB929I', 'I', 'Zero_Chann', '/start', '2022-07-02 16:19:31'),
('ANS478I', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 12:58:23'),
('AOX679M', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 12:58:32'),
('ATY238B', 'I', 'aerminerall', 'ah masak', '2022-07-02 12:58:06'),
('AXB893B', 'B', 'dimas', 'yakin lastt', '2022-07-09 19:53:33'),
('BHW433U', 'I', 'aerminerall', 'hai', '2022-07-02 12:57:56'),
('BWC060Y', 'I', 'Zero_Chann', 'firstname', '2022-07-02 16:20:19'),
('BYC259H', 'I', 'aerminerall', 'hi', '2022-07-02 16:18:50'),
('CGA228O', 'I', 'aerminerall', 'hallo', '2022-07-02 12:58:18'),
('CMH075L', 'I', 'aerminerall', 'p', '2022-07-02 12:59:20'),
('DGN479J', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:20:39'),
('DLW038N', 'O', 'admin', 'Register berhasil gan, selamat!', '2022-07-02 16:19:36'),
('DMX553Y', 'I', 'Zero_Chann', '/register', '2022-07-02 16:19:35'),
('ECD393V', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:20:48'),
('EMX664F', 'B', 'admin', 'Selamat Malam. jangan lupa senyum hari ini', '2022-07-02 13:34:13'),
('EPD403I', 'I', 'Zero_Chann', 'hi', '2022-07-02 16:19:40'),
('EST764K', 'O', 'admin', 'pa pe pa pe, ga da akhlak', '2022-07-02 16:12:01'),
('ETB061N', 'O', 'admin', 'p juga', '2022-07-03 13:31:04'),
('EUG842R', 'O', 'dimas', 'Register berhasil gan, selamat!', '2022-07-11 16:26:35'),
('GFF463B', 'O', 'admin', 'p juga hh', '2022-07-03 14:01:59'),
('GRS898D', 'B', 'admin', 'ppp', '2022-07-04 02:20:34'),
('GTB726T', 'O', 'admin', 'hallo', '2022-07-02 16:18:50'),
('GYL831S', 'I', 'aerminerall', 'hi', '2022-07-11 16:27:42'),
('HBG127H', 'O', 'dimas', 'Hello World!', '2022-06-30 21:29:33'),
('HGB754D', 'I', 'uciel_go_go', 'Kuy', '2022-07-03 13:30:48'),
('HJB789O', 'O', 'dimas', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi tempor commodo sapien, eu scelerisque leo pharetra vel. Nam cursus, magna eget semper pulvinar, massa urna tincidunt ipsum, eu accumsan odio urna sed risus. Fusce pellentesque lorem quis leo sagittis, in tristique erat egestas. Fusce sed rhoncus lectus. Fusce eget rutrum lectus. Proin eget tellus ligula. Proin at tincidunt risus, et lacinia purus. In placerat quam quis sodales porta. Aenean semper, lectus et ornare euismod, libero ipsum sagittis tortor, ac porttitor elit arcu at eros. Vivamus accumsan ipsum eu arcu aliquam, non cursus tellus commodo.', '2022-06-30 21:43:42'),
('HMD343X', 'I', 'aerminerall', '/register', '2022-07-03 14:01:17'),
('HOM508E', 'I', 'uciel_go_go', 'Yo', '2022-07-09 19:34:53'),
('HQA057Z', 'I', 'aerminerall', 'p', '2022-07-03 14:01:53'),
('HSI493J', 'I', 'aerminerall', '/register', '2022-07-11 16:26:15'),
('HWO240P', 'O', 'dimas', 'waalaikumsalam', '2022-07-11 16:28:05'),
('HYI605H', 'I', 'aerminerall', 'assalamualaikum', '2022-07-11 16:28:04'),
('IEZ642I', 'B', 'admin', 'Mabar Cok', '2022-07-02 13:27:52'),
('IHU825D', 'I', 'aerminerall', 'anjay', '2022-07-02 12:58:22'),
('IJI613G', 'B', 'dimas', 'Hallo\n', '2022-07-11 16:29:11'),
('IJK858L', 'O', 'admin', '/register dulu gan !', '2022-07-03 13:29:51'),
('ILB820N', 'B', 'dimas', 'asdf', '2022-07-09 19:49:24'),
('IRR994D', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:20:19'),
('ITJ601K', 'O', 'admin', 'hi', '2022-07-03 14:01:47'),
('IWI229D', 'I', 'uciel_go_go', 'Hallo', '2022-07-09 19:34:46'),
('IWL156I', 'I', 'aerminerall', 'cok matane i', '2022-07-02 16:11:24'),
('JCH015U', 'I', 'aerminerall', 'hallo', '2022-07-02 12:56:03'),
('JDH401U', 'I', 'aerminerall', '/register', '2022-07-02 16:10:55'),
('JDJ095R', 'O', 'dimas', 'Maaf, Keyword tidak terdaftar', '2022-07-09 19:34:54'),
('JKE010P', 'O', 'dimas', 'hallo', '2022-07-09 19:34:50'),
('JKN808T', 'O', 'dimas', 'hi', '2022-07-09 19:34:46'),
('KCQ208E', 'I', 'aerminerall', 'hallo', '2022-07-02 16:18:47'),
('KHP003R', 'B', 'null', 'last', '2022-07-09 19:37:44'),
('KTK169R', 'I', 'aerminerall', 'hallo', '2022-07-03 14:01:47'),
('KZC391F', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-03 14:21:40'),
('LIF684G', 'I', 'null', '/register', '2022-07-03 13:29:55'),
('LSH007S', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 12:58:19'),
('LTU470P', 'B', 'null', 'r34e', '2022-07-09 19:40:34'),
('MAL133H', 'O', 'dimas', '/register dulu gan !', '2022-07-11 16:26:30'),
('MDQ325J', 'O', 'admin', '/register dulu gan !', '2022-07-02 16:19:16'),
('NAQ384V', 'O', 'admin', '/register dulu gan !', '2022-07-02 16:19:32'),
('NJB451T', 'I', 'aerminerall', '/start', '2022-07-11 16:21:37'),
('NNU172A', 'B', 'admin', 'hallo semua', '2022-07-03 14:02:10'),
('NQA995X', 'I', 'null', '/start', '2022-07-03 13:29:51'),
('NVN965D', 'I', 'aerminerall', 'mengapa kamu selingkuh', '2022-07-02 16:11:37'),
('NZH997L', 'I', 'aerminerall', '/register', '2022-07-11 16:26:35'),
('OFL763F', 'B', 'admin', 'Fajar asw', '2022-07-02 16:20:33'),
('ONM592H', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:11:24'),
('PBB459I', 'B', 'admin', 'test\n', '2022-07-09 19:33:06'),
('PIL762T', 'I', 'uciel_go_go', 'Test', '2022-07-09 19:34:40'),
('PNP470J', 'I', 'aerminerall', 'hi', '2022-07-11 16:28:46'),
('QAA128F', 'B', 'admin', 'Hallo semuanya !', '2022-07-02 13:27:00'),
('QHM342V', 'O', 'dimas', 'Maaf, Keyword tidak terdaftar', '2022-07-11 16:29:40'),
('QPH430K', 'I', 'uciel_go_go', 'Hi', '2022-07-09 19:34:49'),
('QPR245D', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:11:44'),
('QUJ782C', 'I', 'aerminerall', 'keyword tidak terdaftar', '2022-07-11 16:27:22'),
('QXV751V', 'I', 'aerminerall', 'dimana kita ?', '2022-07-02 16:11:43'),
('REK497N', 'B', 'admin', 'Mas, ngantuk rak ?', '2022-07-02 16:16:36'),
('RRQ904F', 'O', 'dimas', 'Apa kabar ?', '2022-06-30 21:33:15'),
('RWB311X', 'O', 'dimas', 'Register berhasil gan, selamat!', '2022-07-11 16:26:16'),
('RWJ079E', 'O', 'admin', 'Register berhasil gan, selamat!', '2022-07-02 16:19:19'),
('RZP878A', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 12:58:06'),
('SBR876U', 'O', 'dimas', 'response sudah diupdate', '2022-07-11 16:28:47'),
('SJK721V', 'O', 'admin', 'dimas saputro', '2022-07-02 12:59:06'),
('SPK254N', 'I', 'Zero_Chann', 'manteb juga :v', '2022-07-02 16:19:56'),
('SQG241C', 'O', 'admin', 'Register berhasil gan, selamat!', '2022-07-03 13:29:56'),
('SQI460J', 'O', 'dimas', 'hallo', '2022-07-11 16:27:43'),
('SUS679X', 'O', 'admin', 'Kamu sudah terdaftar, ga usah daftar lagi !', '2022-07-02 12:52:43'),
('SUZ517L', 'O', 'admin', 'p juga hh', '2022-07-03 14:01:53'),
('SWF464N', 'O', 'admin', 'gasss', '2022-07-02 12:59:27'),
('TAD573L', 'B', 'admin', 'Hallo', '2022-07-09 18:44:45'),
('TAX109T', 'I', 'aerminerall', 'who am i', '2022-07-02 12:58:32'),
('TJR347O', 'B', 'null', 'hjklgb', '2022-07-09 19:45:30'),
('TOP638G', 'B', 'null', 'jgfhjfg', '2022-07-09 19:46:44'),
('TUQ624B', 'I', 'aerminerall', 'lorem', '2022-07-02 16:14:13'),
('TVW902E', 'B', 'admin', 'ppp', '2022-07-04 02:20:32'),
('TWR221S', 'O', 'admin', 'Register berhasil gan, selamat!', '2022-07-03 14:01:18'),
('TXX326T', 'O', 'dimas', 'Maaf, Keyword tidak terdaftar', '2022-07-09 19:34:41'),
('TYP013A', 'O', 'dimas', 'Maaf, Keyword tidak terdaftar', '2022-07-11 16:27:24'),
('UDG970C', 'B', 'admin', 'mabar\n', '2022-07-03 13:30:41'),
('UJG006Y', 'I', 'aerminerall', 'p', '2022-07-03 14:01:59'),
('UOM277E', 'O', 'dimas', '/register dulu gan !', '2022-07-11 16:25:52'),
('URJ778T', 'I', 'aerminerall', 'hallo', '2022-07-02 16:10:54'),
('UWJ021N', 'B', 'dimas', 'BARRRRRRR', '2022-07-09 19:49:42'),
('UXP833X', 'O', 'admin', 'hallo', '2022-07-02 16:19:40'),
('VBR839E', 'O', 'admin', 'pa pe pa pe, ga da akhlak', '2022-07-02 12:59:20'),
('VEW071Q', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:11:17'),
('VSF308E', 'I', 'aerminerall', 'p', '2022-07-02 16:12:01'),
('VWQ625R', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:16:43'),
('WDJ474Q', 'I', 'Zero_Chann', 'hi', '2022-07-03 14:21:39'),
('WDJ901N', 'O', 'admin', 'Kamu sudah terdaftar, ga usah daftar lagi !', '2022-07-02 16:10:55'),
('WHS744M', 'I', 'aerminerall', 'hallo', '2022-07-02 16:19:15'),
('WRM202U', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-03 13:30:49'),
('WSY877B', 'I', 'Zero_Chann', 'nyobo :v', '2022-07-02 16:20:47'),
('WUA493P', 'O', 'admin', 'Integer rutrum lacus sagittis, rhoncus ex eu, efficitur tellus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. In ullamcorper, nisi a suscipit ultrices, augue justo iaculis turpis, eget porta nibh ex vitae elit. Nunc ut ante sagittis, sagittis orci et, porta diam. Nulla aliquet, nunc sit amet efficitur ornare, mi neque lobortis enim, vel tempor nisl justo non nisi. Suspendisse ultrices ex quis tincidunt egestas. Donec in blandit magna, id molestie sem. Interdum et malesuada fames ac ante ipsum primis in faucibus. Curabitur vel lectus id mauris suscipit ullamcorper in a arcu. Donec faucibus mauris eget justo accumsan ultrices. Donec nec vulputate erat. Aenean egestas nisi dui, nec varius ipsum tincidunt facilisis. In varius urna ac risus molestie sodales. Aenean velit quam, tempor ac pretium eget, vestibulum quis dolor.', '2022-07-02 16:14:14'),
('XCU695M', 'I', 'aerminerall', '/start', '2022-07-11 16:25:51'),
('XDZ062M', 'O', 'dimas', 'Maaf, Keyword tidak terdaftar', '2022-07-11 16:21:38'),
('XNC981Y', 'I', 'aerminerall', 'who are you', '2022-07-02 12:59:01'),
('XRY006E', 'I', 'Zero_Chann', 'awokwokwokw', '2022-07-02 16:20:39'),
('XYE452Q', 'B', 'null', 'test', '2022-07-09 19:34:29'),
('XYQ271A', 'B', 'admin', 'Hallo Guys', '2022-07-02 13:29:18'),
('YBA661W', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:19:56'),
('YOG345F', 'I', 'aerminerall', 'cek', '2022-07-11 16:26:29'),
('YSD738K', 'I', 'iwan', 'Baik', '2022-06-30 21:34:09'),
('YWB551I', 'I', 'aerminerall', '/register', '2022-07-02 16:19:18'),
('YWY490T', 'B', 'null', 'hlj', '2022-07-09 19:39:59'),
('YXJ260M', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:10:55'),
('ZCN427U', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 16:11:38'),
('ZEN815H', 'I', 'aerminerall', 'mabar', '2022-07-02 12:59:26'),
('ZER701G', 'I', 'aerminerall', 'hai', '2022-07-11 16:29:39'),
('ZHS084B', 'O', 'admin', 'Maaf, Keyword tidak terdaftar', '2022-07-02 12:57:57'),
('ZNA200J', 'I', 'uciel_go_go', 'P', '2022-07-03 13:31:03'),
('ZSU614G', 'I', 'aerminerall', 'bro bro bro', '2022-07-02 16:11:16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `keywords`
--

CREATE TABLE `keywords` (
  `id` char(7) NOT NULL,
  `keyword` varchar(50) NOT NULL,
  `response` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `keywords`
--

INSERT INTO `keywords` (`id`, `keyword`, `response`) VALUES
('BKW046M', 'hallo', 'hi'),
('OTF334R', 'hi', 'response sudah diupdate');

-- --------------------------------------------------------

--
-- Struktur dari tabel `members`
--

CREATE TABLE `members` (
  `id` char(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `members`
--

INSERT INTO `members` (`id`, `name`, `username`) VALUES
('1063179533', 'dimass ', 'aerminerall');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id` char(7) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id`, `name`, `username`, `password`) VALUES
('12JKDFR', 'Admin', 'admin', '123'),
('YMG385W', 'Dimas Saputro', 'dimas', '123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `chats`
--
ALTER TABLE `chats`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `keywords`
--
ALTER TABLE `keywords`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `keyword` (`keyword`);

--
-- Indeks untuk tabel `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
