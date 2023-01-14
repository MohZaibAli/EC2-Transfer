const Configurations = {
    /* Refer devportal/source/src/defaultTheme.js */
    custom: {
        footer: {
            active: true,
            text: '© 2023 - 0CodeAPI Devportal | Powered by API Swagger',
            background: '#000',
            color: '#fff'
        },
        appBar: {
            logo: '/site/public/images/0CodeAPI-DevPortal.webp', // You can set the url to an external image also ( ex: https://dummyimage.com/208x19/66aad1/ffffff&text=testlogo)
            logoHeight: 52,
            logoWidth: 'auto',
            background: '#263e56',
            backgroundImage: '',
        },
        title: {
            prefix: '[Developer Web Portal]',
            sufix: ' - 0CodeAPI Manager',
        },
        landingPage: {
            active: true,
            carousel: {
                active: true,
                slides: [
                    {
                        src: '/site/public/images/landing/01.jpg',
                        title: 'Lorem <span>ipsum</span> dolor sit amet',
                        content:
                            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer felis lacus, placerat vel condimentum in, porta a urna. Suspendisse dolor diam, vestibulum at molestie dapibus, semper eget ex. Morbi sit amet euismod tortor.',
                    },
                    {
                        src: '/site/public/images/landing/02.jpg',
                        title: 'Curabitur <span>malesuada</span> arcu sapien',
                        content:
                            'Curabitur malesuada arcu sapien, suscipit egestas purus efficitur vitae. Etiam vulputate hendrerit venenatis. ',
                    },
                    {
                        src: '/site/public/images/landing/03.jpg',
                        title: 'Nam vel ex <span>feugiat</span> nunc laoreet',
                        content:
                            'Nam vel ex feugiat nunc laoreet elementum. Duis sed nibh condimentum, posuere risus a, mollis diam. Vivamus ultricies, augue id pulvinar semper, mauris lorem bibendum urna, eget tincidunt quam ex ut diam.',
                    },
                ],
            },
            listByTag: {
                active: true,
                content: [
                    {
                        tag: 'Company',
                        title: 'Checkout our Company APIs',
                        description:
                            'We offers online payment solutions and has more than 123 million customers worldwide. The 0CodeAPI Finane API makes powerful functionality available to developers by exposing various features of our platform. Functionality includes but is not limited to invoice management, transaction processing and account management.',
                        maxCount: 5,
                    }
                ],
            },
            parallax: {
                active: true,
                content: [
                    {
                        src: '/site/public/images/landing/parallax1.jpg',
                        title: 'Lorem <span>ipsum</span> dolor sit amet',
                        content:
                            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer felis lacus, placerat vel condimentum in, porta a urna. Suspendisse dolor diam, vestibulum at molestie dapibus, semper eget ex. Morbi sit amet euismod tortor.',
                    },
                    {
                        src: '/site/public/images/landing/parallax2.jpg',
                        title: 'Nam vel ex <span>feugiat</span> nunc laoreet',
                        content:
                            'Nam vel ex feugiat nunc laoreet elementum. Duis sed nibh condimentum, posuere risus a, mollis diam. Vivamus ultricies, augue id pulvinar semper, mauris lorem bibendum urna, eget tincidunt quam ex ut diam.',
                    },
                ],
            },
            contact: {
                active: true,
            },
        },
    },
};
