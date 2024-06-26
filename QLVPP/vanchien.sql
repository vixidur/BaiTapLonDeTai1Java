CREATE DATABASE qlvpp
GO
USE [qlvpp]
GO
/****** Object:  Table [dbo].[chitietnhap]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chitietnhap](
	[sohoadonN] [nvarchar](50) NOT NULL,
	[mamathang] [nvarchar](50) NOT NULL,
	[soluongN] [int] NULL,
	[dongiaN] [float] NULL,
 CONSTRAINT [PK_chitietnhap] PRIMARY KEY CLUSTERED 
(
	[sohoadonN] ASC,
	[mamathang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chitietxuat]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chitietxuat](
	[sohoadonX] [nvarchar](50) NOT NULL,
	[mamathang] [nvarchar](50) NOT NULL,
	[soluongX] [int] NULL,
	[dongiaX] [float] NULL,
 CONSTRAINT [PK_chitietxuat] PRIMARY KEY CLUSTERED 
(
	[sohoadonX] ASC,
	[mamathang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoadonnhap]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoadonnhap](
	[sohoadonnhap] [nvarchar](50) NOT NULL,
	[ngaynhap] [date] NULL,
	[mancc] [nvarchar](50) NULL,
 CONSTRAINT [PK_hoadonnhap] PRIMARY KEY CLUSTERED 
(
	[sohoadonnhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoadonxuat]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoadonxuat](
	[sohoadonxuat] [nvarchar](50) NOT NULL,
	[ngayxuathoadon] [date] NULL,
	[manv] [varchar](50) NULL,
 CONSTRAINT [PK_hoadonxuat] PRIMARY KEY CLUSTERED 
(
	[sohoadonxuat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[mathang]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[mathang](
	[mamathang] [nvarchar](50) NOT NULL,
	[tenmathang] [nvarchar](50) NULL,
	[donvitinh] [nvarchar](50) NULL,
	[nhasx] [nvarchar](50) NULL,
	[chatlieu] [nvarchar](50) NULL,
	[anh] [nvarchar](max) NULL,
 CONSTRAINT [PK_mathang] PRIMARY KEY CLUSTERED 
(
	[mamathang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhacungcap]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhacungcap](
	[mancc] [nvarchar](50) NOT NULL,
	[tenncc] [nvarchar](50) NULL,
	[diachi] [nvarchar](50) NULL,
	[dienthoai] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
 CONSTRAINT [PK_nhacungcap] PRIMARY KEY CLUSTERED 
(
	[mancc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhanvien]    Script Date: 03/06/2024 1:08:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhanvien](
	[manv] [varchar](50) NOT NULL,
	[tennv] [nvarchar](50) NULL,
	[dienthoai] [varchar](50) NULL,
	[pass] [varchar](50) NULL,
 CONSTRAINT [PK_nhanvien] PRIMARY KEY CLUSTERED 
(
	[manv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[mathang] ([mamathang], [tenmathang], [donvitinh], [nhasx], [chatlieu], [anh]) VALUES (N'1', N'Ghế công thái học', N'kg', N'TOMKO', N'Thép', N'D:\products\ghecongthaihoc.jpg')
INSERT [dbo].[mathang] ([mamathang], [tenmathang], [donvitinh], [nhasx], [chatlieu], [anh]) VALUES (N'2', N'Tai nghe DAREU', N'kg', N'DAREU', N'Nhựa', N'D:\products\tainghe.jpg')
INSERT [dbo].[mathang] ([mamathang], [tenmathang], [donvitinh], [nhasx], [chatlieu], [anh]) VALUES (N'3', N'Màn hình', N'kg', N'DELL', N'Thép', N'D:\products\manhinh.jpg')
GO
INSERT [dbo].[nhanvien] ([manv], [tennv], [dienthoai], [pass]) VALUES (N'nv01', N'Trần Văn Chiến', N'0862587229', N'12345')
GO
ALTER TABLE [dbo].[hoadonnhap]  WITH CHECK ADD  CONSTRAINT [FK_hoadonnhap_nhacungcap] FOREIGN KEY([mancc])
REFERENCES [dbo].[nhacungcap] ([mancc])
GO
ALTER TABLE [dbo].[hoadonnhap] CHECK CONSTRAINT [FK_hoadonnhap_nhacungcap]
GO
ALTER TABLE [dbo].[hoadonxuat]  WITH CHECK ADD  CONSTRAINT [FK_hoadonxuat_nhanvien] FOREIGN KEY([manv])
REFERENCES [dbo].[nhanvien] ([manv])
GO
ALTER TABLE [dbo].[hoadonxuat] CHECK CONSTRAINT [FK_hoadonxuat_nhanvien]
GO
